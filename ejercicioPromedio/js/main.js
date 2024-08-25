var periodo1;
var periodo2;
var periodo3;
var taller;
var computo;
var promedioGeneral;

taller= parseInt(prompt("Ingresa la calificacion de taller"));
computo= parseInt(prompt("Ingresa la calificacion de computo"));
periodo1=(taller + computo )/2;
console.log("El promedio del periodo 1 es:" + periodo1);

taller= parseInt(prompt("Ingresa la calificacion de taller"));
computo= parseInt(prompt("Ingresa la calificacion de computo"));
periodo2=(taller + computo )/2;
console.log("El promedio del periodo 1 es:" + periodo2);

taller= parseInt(prompt("Ingresa la calificacion de taller"));
computo= parseInt(prompt("Ingresa la calificacion de computo"));
periodo3=(taller + computo )/2;
console.log("El promedio del periodo 1 es:" + periodo3);

promedioGeneral=(periodo1 + periodo2 + periodo3) /3;
console.log("El promedio general es:" + promedioGeneral);
//console.log("APROBADO" + promedioGeneral > 6);



if(promedioGeneral > 6){
    console.log("APROBADO");
}else{
    console.log("REPROBADO");
}
