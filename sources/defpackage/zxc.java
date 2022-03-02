package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: zxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zxc {
    public final View a;
    public final TextView b = ((TextView) this.a.findViewById(16908310));
    public final TextView c = ((TextView) this.a.findViewById(16908304));
    final View d;
    public final CompoundButton e;

    public zxc(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.romanesco_contacts_type_item, viewGroup, false);
        this.a = inflate;
        viewGroup.addView(inflate);
        CompoundButton compoundButton = (CompoundButton) this.a.findViewById(R.id.toggle);
        this.e = compoundButton;
        compoundButton.setChecked(true);
        View findViewById = this.a.findViewById(16908312);
        this.d = findViewById;
        findViewById.setOnClickListener(new zxb(this));
    }
}
