package defpackage;

import android.content.Intent;
import android.view.View;

/* renamed from: abkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abkr implements View.OnClickListener {
    private final abks a;
    private final Intent b;

    public abkr(abks abks, Intent intent) {
        this.a = abks;
        this.b = intent;
    }

    public void onClick(View view) {
        abks abks = this.a;
        Intent intent = this.b;
        if (intent.resolveActivity(abks.getActivity().getPackageManager()) != null) {
            abks.getActivity().startActivity(intent);
        }
    }
}
