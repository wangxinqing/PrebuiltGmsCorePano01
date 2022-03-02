package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.slice.SliceSpec;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aoq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aoq {
    private final Context a;
    public final anr b;
    private final aov c;
    private final List d;

    public aoq(Context context, Uri uri) {
        this.b = new anr(uri);
        this.a = context;
        this.d = new ArrayList(anw.a(context).a(uri));
        aov a2 = a();
        this.c = a2;
        if (a2 != null) {
            a(a2);
            return;
        }
        throw new IllegalArgumentException("No valid specs found");
    }

    /* access modifiers changed from: protected */
    public aov a() {
        throw null;
    }

    public abstract void a(aov aov);

    /* access modifiers changed from: protected */
    public final boolean a(SliceSpec sliceSpec) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            SliceSpec sliceSpec2 = (SliceSpec) this.d.get(i);
            if (sliceSpec2.a.equals(sliceSpec.a) && sliceSpec2.b >= sliceSpec.b) {
                return true;
            }
        }
        return false;
    }
}
