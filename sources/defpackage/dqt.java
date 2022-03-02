package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dqt implements View.OnClickListener, Comparable {
    public final Context a;
    public final jee b;
    public Intent c;
    public CharSequence d;
    public boolean e = true;
    public final boolean f;
    public final List g;
    public final List h;

    public dqt(Context context, int i, int i2, boolean z) {
        this.a = context;
        this.f = z;
        if (z) {
            this.b = new jee(i, Process.myUid(), 7, i2);
        } else {
            this.b = new jdy("?", i, Process.myUid(), 7, i2);
        }
        this.g = new ArrayList();
        this.h = new ArrayList();
    }

    public final int a() {
        return this.b.l;
    }

    public final boolean b() {
        return this.c != null && this.e;
    }

    public void onClick(View view) {
        if (b() && this.c != null) {
            try {
                view.getContext().startActivity(this.c);
            } catch (ActivityNotFoundException e2) {
            }
        }
    }

    /* renamed from: a */
    public final int compareTo(dqt dqt) {
        return this.b.compareTo(dqt.b);
    }
}
