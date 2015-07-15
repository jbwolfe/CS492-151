
/* ======= Model ======= */

var model = {
    currentconsole: null,
    consoles: [
        {
            clickCount : 0,
            name : 'Atari 2600',
            imgSrc : 'img/Atari2600.jpg',
        },
        {
            clickCount : 0,
            name : 'Atari Jaguar',
            imgSrc : 'img/AtariJaguar.jpg',
        },
        {
            clickCount : 0,
            name : 'Dreamcast',
            imgSrc : 'img/DreamcastConsole.jpg',
        },
        {
            clickCount : 0,
            name : 'Game Boy Pocket',
            imgSrc : 'img/GameBoyPocket.jpg',
        },
        {
            clickCount : 0,
            name : 'Game Cube',
            imgSrc : 'img/GameCube.jpg',
        },
        {
            clickCount : 0,
            name : 'Magnavox Odyssey',
            imgSrc : 'img/MagnavoxOdysseyConsole.jpg',
        },
        {
            clickCount : 0,
            name : 'N64',
            imgSrc : 'img/N64Console.jpg',
        },
        {
            clickCount : 0,
            name : 'NES',
            imgSrc : 'img/NESConsole.jpg',
        },
        {
            clickCount : 0,
            name : 'Play Station X',
            imgSrc : 'img/PSXConsole.jpg',
        },
        {
            clickCount : 0,
            name : 'Play Station 2',
            imgSrc : 'img/PS2FatConsole.jpg',
        },
        {
            clickCount : 0,
            name : 'Play Station 4',
            imgSrc : 'img/PS4Console.jpg',
        },
        {
            clickCount : 0,
            name : 'Sega Genesis',
            imgSrc : 'img/SegaGenesis.jpg',
        },
        {
            clickCount : 0,
            name : 'Sega Saturn',
            imgSrc : 'img/SegaSaturnConsole.jpg',
        },
        {
            clickCount : 0,
            name : 'SNES',
            imgSrc : 'img/SNESConsole.jpg',
        },
        {
            clickCount : 0,
            name : 'Super Famicom',
            imgSrc : 'img/SuperFamicomConsole.jpg',
        },
        {
            clickCount : 0,
            name : 'Virtual Boy',
            imgSrc : 'img/VirtualBoy.jpg',
        },
        {
            clickCount : 0,
            name : 'Wii',
            imgSrc : 'img/WiiConsole.png',
        },
        {
            clickCount : 0,
            name : 'Xbox 360',
            imgSrc : 'img/Xbox360.jpg',
        },
        {
            clickCount : 0,
            name : 'Xbox',
            imgSrc : 'img/XboxConsole.png',
        }
    ]
};


/* ======= Octopus ======= */

var octopus = {

    init: function() {
        // set our current console to the first one in the list
        model.currentconsole = model.consoles[0];

        // tell our views to initialize
        consoleListView.init();
        consoleView.init();
    },

    getCurrentconsole: function() {
        return model.currentconsole;
    },

    getconsoles: function() {
        return model.consoles;
    },

    // set the currently-selected console to the object passed in
    setCurrentconsole: function(console) {
        model.currentconsole = console;
    },

    // increments the counter for the currently-selected console
    incrementCounter: function() {
        model.currentconsole.clickCount++;
        consoleView.render();
    }
};


/* ======= View ======= */

var consoleView = {

    init: function() {
        // store pointers to our DOM elements for easy access later
        this.consoleElem = document.getElementById('console');
        this.consoleNameElem = document.getElementById('console-name');
        this.consoleImageElem = document.getElementById('console-img');
        this.countElem = document.getElementById('console-count');

        // on click, increment the current console's counter
        this.consoleImageElem.addEventListener('click', function(){
            octopus.incrementCounter();
        });

        // render this view (update the DOM elements with the right values)
        this.render();
    },

    render: function() {
        // update the DOM elements with values from the current console
        var currentconsole = octopus.getCurrentconsole();
        this.countElem.textContent = "Count: "+currentconsole.clickCount;
        this.consoleNameElem.textContent = currentconsole.name;
        this.consoleImageElem.src = currentconsole.imgSrc;
    }
};

var consoleListView = {

    init: function() {
        // store the DOM element for easy access later
        this.consoleListElem = document.getElementById('console-list');

        // render this view (update the DOM elements with the right values)
        this.render();
    },

    render: function() {
        var console, elem, i;
        // get the consoles we'll be rendering from the octopus
        var consoles = octopus.getconsoles();

        // empty the console list
        this.consoleListElem.innerHTML = '';

        // loop over the consoles
        for (i = 0; i < consoles.length; i++) {
            // this is the console we're currently looping over
            console = consoles[i];

            // make a new console list item and set its text
            elem = document.createElement('li');
            elem.innerHTML = "<h3><span class='label label-default'>"+console.name+"</span></h3>";

            // on click, setCurrentconsole and render the consoleView
            // (this uses our closure-in-a-loop trick to connect the value
            //  of the console variable to the click event function)
            elem.addEventListener('click', (function(consoleCopy) {
                return function() {
                    octopus.setCurrentconsole(consoleCopy);
                    consoleView.render();
                };
            })(console));

            // finally, add the element to the list
            this.consoleListElem.appendChild(elem);
        }
    }
};

// make it go!
octopus.init();
