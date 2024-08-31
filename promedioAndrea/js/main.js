var captura=confirm("¿quieres capturar un alumno?");
if(captura==true){
   var nombre = prompt("Escribe el nombre del alumno");
   var calificacion = parseFloat(prompt("Escribe la calificacion"));
   var sumaCalificaciones = 0;
   sumaCalificaciones = sumaCalificaciones + calificacion;
   calificacion = parseFloat(prompt("Escribe la calificacion"));
   sumaCalificaciones = sumaCalificaciones + calificacion;
   calificacion = parseFloat(prompt("Escribe la calificacion"));
   sumaCalificaciones = sumaCalificaciones + calificacion;
   var promedioPeriodo= sumaCalificaciones / 3;
   alert(`alumno: ${nombre} \npromedio: ${promedioPeriodo}`);
}else{
    alert("Hasta pronto.😥");
}
