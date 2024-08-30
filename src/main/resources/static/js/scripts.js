document.querySelectorAll('.button-remove').forEach(button => {
    button.addEventListener('click', function(event) {
        if (!confirm("Are you sure you want to remove this item?")) {
            event.preventDefault();
        }
    });
    });


    <script>

        document.querySelectorAll('.section').forEach(section => {
            section.addEventListener('click', () => {
                const content = section.querySelector('.section-content');
                const arrow = section.querySelector('.arrow');
                content.style.display = content.style.display === 'none' || content.style.display === '' ? 'block' : 'none';
                arrow.classList.toggle('up');
                arrow.classList.toggle('down');
            });
        });
    </script>