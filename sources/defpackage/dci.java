package defpackage;

import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;
import com.google.android.material.button.MaterialButton;

/* renamed from: dci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dci implements ax {
    private final dcm a;

    public dci(dcm dcm) {
        this.a = dcm;
    }

    public final void a(Object obj) {
        dcm dcm = this.a;
        amri amri = (amri) obj;
        iva.a((Object) dcm.c);
        ViewGroup viewGroup = (ViewGroup) dcm.getView().findViewById(R.id.content);
        if (!amri.a()) {
            viewGroup.setVisibility(4);
            return;
        }
        cyf cyf = (cyf) amri.b();
        viewGroup.setVisibility(0);
        String str = cyf.a;
        String str2 = cyf.b;
        boolean a2 = cyf.a();
        aqrl aqrl = cyf.d;
        String str3 = cyf.c;
        dcl dcl = new dcl(dcm, cyf);
        FadeInImageView fadeInImageView = (FadeInImageView) viewGroup.findViewById(R.id.error_image);
        MaterialButton materialButton = (MaterialButton) viewGroup.findViewById(R.id.error_button);
        cyd.a((TextView) viewGroup.findViewById(R.id.error_title), str);
        cyd.a((TextView) viewGroup.findViewById(R.id.error_summary), str2);
        if (str3 != null) {
            materialButton.setVisibility(0);
            materialButton.setText(str3);
            materialButton.setOnClickListener(dcl);
        } else {
            materialButton.setVisibility(8);
        }
        cyd.a(dcm.c, fadeInImageView, a2, aqrl);
        rt.a(fadeInImageView, ColorStateList.valueOf(que.b(dcm.getContext(), R.attr.colorOnSurfaceVariant, R.color.google_grey700)));
    }
}
