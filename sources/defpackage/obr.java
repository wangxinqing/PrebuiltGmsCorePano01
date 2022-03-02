package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: obr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class obr implements View.OnClickListener {
    final /* synthetic */ avnj a;
    final /* synthetic */ Activity b;
    final /* synthetic */ obv c;

    public obr(obv obv, avnj avnj, Activity activity) {
        this.c = obv;
        this.a = avnj;
        this.b = activity;
    }

    public void onClick(View view) {
        String str = this.a.b;
        String charSequence = this.c.getText().toString();
        obu obu = new obu();
        Bundle bundle = new Bundle();
        bundle.putString("tag", str);
        bundle.putString("current_date", charSequence);
        obu.setArguments(bundle);
        obu.show(this.b.getSupportFragmentManager(), "date_dialog");
    }
}
