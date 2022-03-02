package defpackage;

import android.content.Context;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: acpk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpk {
    public static DialogFragment a(Context context, int i) {
        return acmd.a(i, context.getString(R.string.smartdevice_do_disclosure_generic), context.getString(R.string.smartdevice_do_unsupported_message), context.getString(R.string.common_got_it), (String) null, false);
    }
}
