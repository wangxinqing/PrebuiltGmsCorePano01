package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: mft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mft extends sr {
    private final TextView b;

    public mft(Context context) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.fm_fragment_error_dialog, (ViewGroup) null);
        this.b = (TextView) inflate.findViewById(R.id.fm_error_message);
        b(inflate);
        a(false);
    }

    public final void a(CharSequence charSequence) {
        mgh.a(this.b, charSequence);
    }

    public final void b(int i) {
        a(a().getText(i));
    }
}
