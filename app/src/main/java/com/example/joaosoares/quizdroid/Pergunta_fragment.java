package com.example.joaosoares.quizdroid;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Pergunta_fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Pergunta_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Pergunta_fragment extends Fragment {

    private TextView pergunta_fragment;
    private TextView texto_detalhe_opcao1;
    private TextView texto_detalhe_opcao2;
    private TextView texto_detalhe_opcao3;
    private TextView texto_detalhe_opcao4;

    private Pergunta mPergunta;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,	Bundle savedInstanceState) {

        View mContentView = inflater.inflate(R.layout.fragment_pergunta_fragment, container, false);

        pergunta_fragment = (TextView) mContentView.findViewById(R.id.pergunta_fragment);
        texto_detalhe_opcao1 = (TextView) mContentView.findViewById(R.id.texto_detalhe_opcao1);
        texto_detalhe_opcao2 = (TextView) mContentView.findViewById(R.id.texto_detalhe_opcao2);
        texto_detalhe_opcao2 = (TextView) mContentView.findViewById(R.id.texto_detalhe_opcao2);
        texto_detalhe_opcao3 = (TextView) mContentView.findViewById(R.id.texto_detalhe_opcao3);
        texto_detalhe_opcao4 = (TextView) mContentView.findViewById(R.id.texto_detalhe_opcao4);

        return mContentView;
    }

  //  @Override
  //  public void onResume() {
  //      super.onResume();
  //      updatePergunta();
  //  }

  //  public void setPerson(Pergunta p) {
  //      this.mPergunta = p;
  //      updatePergunta();
  //  }

  //  public void updatePergunta() {
  //      if(pergunta_fragment != null && texto_detalhe_opcao1 != null && texto_detalhe_opcao2 != null && texto_detalhe_opcao3 != null && texto_detalhe_opcao4 != null && mPergunta != null) {
            //txtPersonId.setText(mPerson.getId() + "");
  //          pergunta_fragment.setText(mPergunta.getQuestao());
  //          texto_detalhe_opcao1.setText(mPergunta.getPrimeiraOpcao());
    //        texto_detalhe_opcao2.setText(mPergunta.getSegundaOpcao());
      //      texto_detalhe_opcao3.setText(mPergunta.getTerceiraOpcao());
        //    texto_detalhe_opcao4.setText(mPergunta.getQuartaOpcao());

//        }
  //  }


}
