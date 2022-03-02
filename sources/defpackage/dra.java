package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.chimera.DialogFragment;

/* renamed from: dra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dra implements View.OnClickListener {
    final Button a;
    final Button b;
    final int c;
    final /* synthetic */ drb d;

    public dra(drb drb, Button button, Button button2, int i) {
        this.d = drb;
        this.a = button;
        this.b = button2;
        this.c = i;
    }

    public void onClick(View view) {
        DialogFragment dialogFragment;
        if (this.c != 1) {
            dialogFragment = new dre();
            dialogFragment.show(this.d.getFragmentManager(), "timePicker");
        } else {
            dialogFragment = new dqb();
            dialogFragment.show(this.d.getFragmentManager(), "datePicker");
        }
        Bundle bundle = new Bundle();
        bundle.putInt("buttonId", view.getId());
        String valueOf = String.valueOf(this.a.getText());
        String valueOf2 = String.valueOf(this.b.getText());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(" ");
        sb.append(valueOf2);
        bundle.putCharArray("dateString", sb.toString().toCharArray());
        dialogFragment.setArguments(bundle);
    }
}
