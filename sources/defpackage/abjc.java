package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: abjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abjc implements View.OnClickListener {
    private final Intent a;
    private final Context b;
    private final jtf c;

    public abjc(Intent intent, Context context, jtf jtf) {
        this.a = intent;
        this.b = context;
        this.c = jtf;
    }

    public void onClick(View view) {
        Intent intent = this.a;
        Context context = this.b;
        jtf jtf = this.c;
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            jtf.a(jth.SEE_ALL_LINK, jth.SMART_PROFILE_PHOTOS_CARD);
            context.startActivity(intent);
        }
    }
}
