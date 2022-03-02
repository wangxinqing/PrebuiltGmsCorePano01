package defpackage;

import android.text.TextUtils;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import java.util.ArrayList;

/* renamed from: juo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class juo {
    public final ArrayList a = new ArrayList();

    private static String[] b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new String[]{str};
    }

    public final KeyFilterImpl a() {
        return new KeyFilterImpl(this.a);
    }

    public final void a(String str) {
        this.a.add(new KeyFilterImpl.Inclusion(b(str), b((String) null), b((String) null)));
    }
}
