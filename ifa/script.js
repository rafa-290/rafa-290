document.addEventListener("DOMContentLoaded", function () {
  const odus = [
    ["Ogbè", [1, 1, 1, 1]],
    ["Ọ̀yẹ̀kú", [2, 2, 2, 2]],
    ["Ìwòrì", [2, 1, 1, 2]],
    ["Òdí", [1, 2, 2, 1]],
    ["Ìrosùn", [1, 1, 2, 2]],
    ["Ọ̀wọ́nrín", [2, 2, 1, 1]],
    ["Ọ̀bàrà", [1, 2, 2, 2]],
    ["Ọ̀kànràn", [2, 2, 2, 1]],
    ["Ògúndá", [1, 1, 1, 2]],
    ["Ọ̀ṣá", [2, 1, 1, 1]],
    ["Ìká", [2, 1, 2, 2]],
    ["Òtúúrúpọ̀n", [2, 2, 1, 2]],
    ["Òtúrá", [1, 2, 1, 1]],
    ["Ìrẹ̀tẹ̀", [1, 1, 2, 1]],
    ["Ọ̀ṣẹ́", [1, 2, 1, 2]],
    ["Òfún", [2, 1, 2, 1]],
  ];

  const button = document.getElementById("gerar-odu");
  const container = document.getElementById("odu-container");

  button.addEventListener("click", function () {
    container.innerHTML = ""; // Limpar o conteúdo anterior
    const randomOdu1 = odus[Math.floor(Math.random() * odus.length)];
    const randomOdu2 = odus[Math.floor(Math.random() * odus.length)];
    const oduName = `${randomOdu1[0]} - ${randomOdu2[0]}`;
    const oduPattern1 = randomOdu1[1];
    const oduPattern2 = randomOdu2[1];

    let oduElement = document.createElement("div");
    oduElement.className = "odu";

    let nameElement = document.createElement("div");
    nameElement.className = "odu-name";
    nameElement.textContent = oduName;
    oduElement.appendChild(nameElement);

    let tracoContainer = document.createElement("div");
    tracoContainer.className = "traco-container";

    // Adicionar traços do primeiro odu (direita)
    let tracoContainer1 = document.createElement("div");
    tracoContainer1.className = "coluna";
    for (let i = 0; i < oduPattern1.length; i++) {
      let traco = document.createElement("div");
      traco.className = "traco " + (oduPattern1[i] === 2 ? "aberto" : "");
      tracoContainer1.appendChild(traco);
    }

    // Adicionar traços do segundo odu (esquerda)
    let tracoContainer2 = document.createElement("div");
    tracoContainer2.className = "coluna";
    for (let i = 0; i < oduPattern2.length; i++) {
      let traco = document.createElement("div");
      traco.className = "traco " + (oduPattern2[i] === 2 ? "aberto" : "");
      tracoContainer2.appendChild(traco);
    }

    tracoContainer.appendChild(tracoContainer2); // Primeiro odu (direita)
    tracoContainer.appendChild(tracoContainer1); // Segundo odu (esquerda)

    oduElement.appendChild(tracoContainer);
    container.appendChild(oduElement);
  });
});
