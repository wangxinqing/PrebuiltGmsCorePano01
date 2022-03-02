package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.R;

/* renamed from: jrx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jrx {
    public static ss a(Context context, String str) {
        ajwe ajwe = new ajwe(context);
        ajwe.d(str);
        ajwe.c((CharSequence) context.getResources().getString(R.string.profile_communicate_entry_copy_label), (DialogInterface.OnClickListener) new jrw(context, str));
        return ajwe.b();
    }
}
