window.addEventListener("load", async () => {
    try {
        const response = await fetch(
        "https://raw.githubusercontent.com/ironhack-jc/mid-term-api/main/projects"
        );
        const data = await response.json();
        sendData(data);
        console.log (data);
    } catch (error) {
        throw new Error("Error al cargar el archivo JSON");
    }
});

function sendData(data) {
    let paragraph = document.getElementById("paragraph")
    let title1 = document.getElementById("title1");
    let subtitle1 = document.getElementById("subtitle1");
    let title2 = document.getElementById("title2");
    let subtitle2 = document.getElementById("subtitle2");
    let title3 = document.getElementById("title3");
    let subtitle3 = document.getElementById("subtitle3");
    paragraph.innerHTML = data[3].content;
    title1.innerHTML= data[1].name;
    subtitle1.innerHTML = data[1].description;
    console.log("Inner index 1 =" + data[1]);
    title2.innerHTML= data[2].name;
    subtitle2.innerHTML = data[2].description;
    console.log("Inner index 2 =" + data[2]);
    title3.innerHTML= data[3].name;
    subtitle3.innerHTML = data[3].description;
    console.log("Inner index 3 =" + data[3]);
}