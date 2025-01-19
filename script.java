// JavaScript for the Game Top-Up Website
document.addEventListener('DOMContentLoaded', () => {
    // Event listener for all "Top Up Now" buttons
    const buttons = document.querySelectorAll('.btn-primary');

    buttons.forEach(button => {
        button.addEventListener('click', (event) => {
            event.preventDefault();

            // Simulate fetching game ID or showing a form
            const gameTitle = button.closest('.card').querySelector('.card-title').textContent;
            const userID = prompt(`Enter your ID for ${gameTitle}:`);

            if (userID) {
                alert(`Processing top-up for ${gameTitle} with ID: ${userID}`);
                // Add logic to send this data to a backend or process the top-up
            } else {
                alert('Top-up canceled. Please enter a valid ID.');
            }
        });
    });
});


const slider = document.querySelector('.banner-slider');
let index = 0;
const slides = document.querySelectorAll('.slide');
const totalSlides = slides.length;

function slideNext() {
  index = (index + 1) % totalSlides;
  slider.style.transform = `translateX(-${index * 100}%)`;
}

setInterval(slideNext, 3000); // Slide setiap 3 detik

function showGames(category) {
  const games = {
    popular: ['images/emel.jpg', 'images/epep.jpg', 'images/hok.png', 'images/pubg.jpg'],
    new: ['images/CODM.jpg', 'images/game-new2.jpg', 'images/game-new3.jpg', 'images/game-new4.jpg'],
    mobile: ['images/game-mobile1.jpg', 'images/game-mobile2.jpg', 'images/game-mobile3.jpg', 'images/game-mobile4.jpg'],
    pc: ['images/game-pc1.jpg', 'images/game-pc2.jpg', 'images/game-pc3.jpg', 'images/game-pc4.jpg']
  };

  const game1 = document.getElementById('game1');
  const game2 = document.getElementById('game2');
  const game3 = document.getElementById('game3');
  const game4 = document.getElementById('game4');

  game1.src = games[category][0];
  game2.src = games[category][1];
  game3.src = games[category][2];
  game4.src = games[category][3];
}



}
