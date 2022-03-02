package defpackage;

import android.content.Context;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: wnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class wnc extends wnd {
    public wnc(String str, int i, wzv wzv, String str2, String str3) {
        this(str, i, wzv, str2, str3, (byte[]) null);
    }

    public final DataHolder[] c(Context context) {
        return new DataHolder[]{d(context)};
    }

    public abstract DataHolder d(Context context);

    protected wnc(String str, int i, wzv wzv, String str2, String str3, byte[] bArr) {
        super(str, i, wzv, false, str2, str3);
    }
}
