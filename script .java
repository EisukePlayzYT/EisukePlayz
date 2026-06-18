// Smooth navbar scroll effect

document.querySelectorAll('.nav-links a').forEach(link => {

    link.addEventListener('click', function(e){

        const target = document.querySelector(
            this.getAttribute('href')
        );

        if(target){

            e.preventDefault();

            target.scrollIntoView({
                behavior:"smooth"
            });

        }

    });

});




// Reveal animation when scrolling

const sections = document.querySelectorAll("section");


const observer = new IntersectionObserver(entries => {

    entries.forEach(entry => {

        if(entry.isIntersecting){

            entry.target.style.opacity = "1";
            entry.target.style.transform = "translateY(0)";

        }

    });


},{
    threshold:0.15
});



sections.forEach(section => {

    section.style.opacity="0";

    section.style.transform="translateY(50px)";

    section.style.transition=
    "all 0.8s ease";


    observer.observe(section);

});





// Button glow effect

const buttons = document.querySelectorAll(".btn");


buttons.forEach(button=>{


button.addEventListener("mouseenter",()=>{


button.style.filter=
"brightness(1.3)";


});



button.addEventListener("mouseleave",()=>{


button.style.filter=
"brightness(1)";


});


});






// Floating blocks random movement


const blocks =
document.querySelectorAll(".block");


blocks.forEach(block=>{


let randomX =
Math.random()*40-20;


block.style.marginLeft =
randomX+"px";


});


// Soft background music

const music = document.getElementById("bgMusic");

music.volume = 0.08; // 8% volume (very quiet)

music.loop = true;


// Try to start music
window.addEventListener("load", () => {

    music.play().catch(() => {

        console.log("Browser blocked autoplay until user interaction.");

    });

});





// Console message


console.log(
"🎮 Welcome to EisukePlayzYT Website!"
);

console.log(
"⛏️ Minecraft Creator Portfolio Loaded"
);