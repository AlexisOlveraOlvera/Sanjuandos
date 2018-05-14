package mecalogik.com.sanjuandos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrincipalFragment extends Fragment {

    ViewFlipper viewFlipper;

    public PrincipalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_principal, container, false);

        int images[] = {R.drawable.san_juan, R.drawable.quere, R.drawable.tequis};

        viewFlipper = view.findViewById(R.id.v_flipper);

        /*for (int i = 0; i<images.length; i++){
            flippermages(images[1]);
        }*/

        for (int image: images){
            flippermages(image);
        }

        return view;
    }

    public void flippermages(int image){
        ImageView imageView = new ImageView(getActivity());
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(4000);  //4 sec
        viewFlipper.setAutoStart(true);

        // animation

        viewFlipper.setInAnimation(getActivity(),android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(getActivity(),android.R.anim.slide_out_right);

    }

}
