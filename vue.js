<!DOCTYPE html>
<html>
    <head>
        <title>Vue Example</title>
    </head>
    <body>
        <div id="app">{{ myText }}</div>

        <script src="https://cdn.jsdelivr.net/npm/vue"></script>
        <script>
            new Vue({
                el: '#app',
                data: {
                    myText: 'Hesssllo',
                },
            });
        </script>
    </body>
</html>