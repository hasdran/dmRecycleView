package br.edu.ifpr.paranagua.recicleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todasTarefasdoMundo =
                    listOf<Tarefa>(
                            Tarefa("Lavar o gato", "Com Sabão de Soda!"),
                            Tarefa("Varrer a casa", "Com Sabão de coco!"),
                            Tarefa("Fazer trabalho", "ASDASDASD"),
                            Tarefa("Lavar o gato", "Com Sabão de Soda!"),
                            Tarefa("Varrer a casa", "Com Sabão de coco!"),
                            Tarefa("Fazer trabalho", "ASDASDASD"),
                            Tarefa("Lavar o gato", "Com Sabão de Soda!"),
                            Tarefa("Varrer a casa", "Com Sabão de coco!"),
                            Tarefa("Fazer trabalho", "ASDASDASD")
                    )
        val adapter = TarefasAdapter(todasTarefasdoMundo)

        listTarefas.adapter = adapter

        val layout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        listTarefas.layoutManager = layout
    }
}
