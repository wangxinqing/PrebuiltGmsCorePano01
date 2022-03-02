package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: abju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abju implements View.OnClickListener {
    private final Intent a;
    private final Context b;

    public abju(Intent intent, Context context) {
        this.a = intent;
        this.b = context;
    }

    public void onClick(View view) {
        Intent intent = this.a;
        Context context = this.b;
        if (intent != null && intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }
}
