package mx.edu.ittepic.ladm_u2_practica2_irmintrujillo

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class Lienzo(p:MainActivity) : View(p) {
    // se requiere p para que view sepa cual activity va a trabajar
    var puntero = p
    /*var cx = 150f
    var cy = 150f
    var tx = 733f
    var ty = 818f*/
    var circulo = FiguraGeometrica(150, 150, 98)
    var circulo2 = FiguraGeometrica(500, 1400, 98)
    var circulo3 = FiguraGeometrica(750, 400, 150)
    var circulo4 = FiguraGeometrica(500, 1400, 49)
    var circulo5 = FiguraGeometrica(654, 1000, 150)
    var circulo6 = FiguraGeometrica(900, 1200, 98)
    var circulo7 = FiguraGeometrica(800, 800, 49)
    var circulo8 = FiguraGeometrica(100, 100, 150)
    var circulo9 = FiguraGeometrica(1000, 1000, 150)

    var punteroFiguraGeometrica: FiguraGeometrica? = null

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.rgb(37,79,243))

        //Dibujando un círculo rojo con contorno blanco
        paint.color = Color.argb(100,150,170,250)
        circulo.pintar(canvas, paint)


        //Dibujando 2do circulo
        paint.color = Color.argb(100,150,170,250)
        circulo2.pintar(canvas, paint)


        //Dibujando 3er circulo
        paint.color = Color.argb(100,150,170,250)
        circulo3.pintar(canvas, paint)


        //Dibujando 4to circulo
        paint.color = Color.argb(100,150,170,250)
        circulo4.pintar(canvas, paint)



        //Dibujando 5to circulo
        paint.color = Color.argb(100,150,170,250)
        circulo5.pintar(canvas, paint)



        //Dibujando 6to circulo
        paint.color = Color.argb(100,150,170,250)
        circulo6.pintar(canvas, paint)

        //Dibujando 7mo circulo
        paint.color = Color.argb(100,150,170,250)
        circulo7.pintar(canvas, paint)
        //8
        paint.color = Color.argb(100,150,170,250)
        circulo8.pintar(canvas, paint)
        //9
        paint.color = Color.argb(100,150,170,250)
        circulo9.pintar(canvas, paint)



    }



    fun animarCirculo() {
        circulo.rebote(width, height)
        circulo2.rebote(width, height)
        circulo3.rebote(width, height)
        circulo4.rebote(width, height)
        circulo5.rebote(width, height)
        circulo6.rebote(width, height)
        circulo7.rebote(width, height)
        circulo8.rebote(width, height)
        circulo9.rebote(width, height)


        invalidate()
    }

}