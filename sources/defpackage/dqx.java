package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import java.util.Date;

/* renamed from: dqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dqx implements View.OnClickListener {
    final /* synthetic */ drb a;

    public dqx(drb drb) {
        this.a = drb;
    }

    public void onClick(View view) {
        if (!this.a.a(this.a.a(), this.a.b())) {
            drb drb = this.a;
            Date a2 = drb.a();
            Date b = drb.b();
            StringBuilder sb = new StringBuilder();
            sb.append("GMS Core Radio Activity:\n");
            if (axbe.g()) {
                drb.a(0, a2, b, sb);
            }
            if (axbe.h()) {
                drb.a(1, a2, b, sb);
            }
            drb.b = sb.toString();
            drb drb2 = this.a;
            drb2.c.setText(drb2.b);
            ((LinearLayout) this.a.d.findViewById(R.id.file_content_text_view_heading_linear_layout)).setVisibility(0);
            ((LinearLayout) this.a.d.findViewById(R.id.dump_linear_layout)).setVisibility(0);
        }
    }
}
