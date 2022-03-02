package defpackage;

import android.content.Context;
import com.google.android.gms.R;

/* renamed from: abjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abjl extends abjz {
    public abjl(Context context) {
        super(context, 3);
    }

    public final void a() {
        this.c.getChildAt(this.a - 1).findViewById(R.id.bottom_divider).setVisibility(0);
        super.a();
    }

    public final void b() {
        this.c.getChildAt(this.a - 1).findViewById(R.id.bottom_divider).setVisibility(4);
        super.b();
    }
}
