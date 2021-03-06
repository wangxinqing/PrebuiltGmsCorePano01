package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SpeechOrbView extends SearchOrbView {
    private alb c;

    public SpeechOrbView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final int a() {
        return R.layout.lb_speech_orb;
    }

    public SpeechOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpeechOrbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        resources.getFraction(R.fraction.lb_search_bar_speech_orb_max_level_zoom, 1, 1);
        this.c = new alb(resources.getColor(R.color.lb_speech_orb_not_recording), resources.getColor(R.color.lb_speech_orb_not_recording_pulsed), resources.getColor(R.color.lb_speech_orb_not_recording_icon));
        new alb(resources.getColor(R.color.lb_speech_orb_recording), resources.getColor(R.color.lb_speech_orb_recording), 0);
        a(this.c);
        a(getResources().getDrawable(R.drawable.lb_ic_search_mic_out));
        a(hasFocus());
        this.b.setScaleX(1.0f);
        this.b.setScaleY(1.0f);
    }
}
