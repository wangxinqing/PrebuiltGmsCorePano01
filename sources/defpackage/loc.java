package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.widget.TextView;

/* renamed from: loc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class loc {
    public static final DialogInterface.OnKeyListener a = lob.a;

    public static Context a(Context context) {
        return new ContextThemeWrapper(context, 2132019198);
    }

    public static void a(TextView textView, Dialog dialog) {
        iva.a((Object) dialog);
        textView.setOnEditorActionListener(new loa(dialog));
    }
}
