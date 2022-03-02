package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.contactsheet.card.common.CardButton;

/* renamed from: jrq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jrq implements ax {
    public final View a;
    public final ImageView b;
    public final jtf c;
    private final CardButton d;
    private final ViewGroup e;
    private final TextView f;
    private final jsx g;

    public jrq(View view, jsx jsx, jtf jtf) {
        this.g = jsx;
        this.c = jtf;
        this.a = view;
        this.d = (CardButton) view.findViewById(R.id.card_button);
        this.e = (ViewGroup) view.findViewById(R.id.location_info);
        this.b = (ImageView) view.findViewById(R.id.location_map_image);
        this.f = (TextView) view.findViewById(R.id.shared_current_location_title);
        view.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0241  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.amri r19) {
        /*
            r18 = this;
            r0 = r18
            android.view.View r1 = r0.a
            r2 = 8
            r1.setVisibility(r2)
            boolean r1 = r19.a()
            if (r1 == 0) goto L_0x0247
            java.lang.Object r1 = r19.b()
            avjx r1 = (defpackage.avjx) r1
            avid r3 = r1.b
            if (r3 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            avid r3 = defpackage.avid.h
        L_0x001c:
            int r4 = r3.b
            int r4 = defpackage.avic.a(r4)
            java.lang.String r5 = "android.intent.action.VIEW"
            java.lang.String r6 = ","
            if (r4 != 0) goto L_0x0029
            goto L_0x0095
        L_0x0029:
            r7 = 2
            if (r4 != r7) goto L_0x0095
            int r4 = r3.a
            r7 = r4 & 2
            if (r7 == 0) goto L_0x0095
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0095
            java.lang.String r4 = r3.f
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0095
            double r7 = r3.c
            double r9 = r3.d
            java.lang.String r4 = r3.f
            android.content.Intent r11 = new android.content.Intent
            r11.<init>(r5)
            java.lang.String r4 = android.net.Uri.encode(r4)
            java.lang.String r12 = java.lang.String.valueOf(r4)
            int r12 = r12.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r12 = r12 + 107
            r13.<init>(r12)
            java.lang.String r12 = "geo:"
            r13.append(r12)
            r13.append(r7)
            r13.append(r6)
            r13.append(r9)
            java.lang.String r12 = "?q="
            r13.append(r12)
            r13.append(r7)
            r13.append(r6)
            r13.append(r9)
            java.lang.String r7 = "("
            r13.append(r7)
            r13.append(r4)
            java.lang.String r4 = ")"
            r13.append(r4)
            java.lang.String r4 = r13.toString()
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r11.setData(r4)
            amri r4 = defpackage.amri.b(r11)
            goto L_0x00a8
        L_0x0095:
            int r4 = r3.a
            r4 = r4 & 32
            if (r4 == 0) goto L_0x00a6
            java.lang.String r4 = r3.f
            android.content.Intent r4 = defpackage.jrp.a(r4)
            amri r4 = defpackage.amri.b(r4)
            goto L_0x00a8
        L_0x00a6:
            ampu r4 = defpackage.ampu.a
        L_0x00a8:
            java.lang.String r7 = r3.g
            boolean r7 = r7.isEmpty()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x00b9
            android.widget.ImageView r7 = r0.b
            r7.setVisibility(r2)
            r7 = 0
            goto L_0x0119
        L_0x00b9:
            java.lang.String r7 = r3.g
            jsx r10 = r0.g
            android.net.Uri r11 = android.net.Uri.parse(r7)
            java.lang.String r12 = r11.getScheme()
            java.lang.String r13 = "https"
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto L_0x010e
            java.lang.String r11 = r11.getScheme()
            java.lang.String r12 = "http"
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L_0x010e
            java.lang.String r11 = "//"
            boolean r11 = r7.startsWith(r11)
            if (r11 == 0) goto L_0x00f8
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r11 = "https:"
            int r12 = r7.length()
            if (r12 != 0) goto L_0x00f3
            java.lang.String r7 = new java.lang.String
            r7.<init>(r11)
            goto L_0x010e
        L_0x00f3:
            java.lang.String r7 = r11.concat(r7)
            goto L_0x010e
        L_0x00f8:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r11 = "https://"
            int r12 = r7.length()
            if (r12 != 0) goto L_0x010a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r11)
            goto L_0x010e
        L_0x010a:
            java.lang.String r7 = r11.concat(r7)
        L_0x010e:
            jrl r11 = new jrl
            r11.<init>(r0, r4)
            r12 = 12
            r10.a(r7, r12, r11)
            r7 = 1
        L_0x0119:
            java.lang.String r10 = r3.f
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x01a7
            android.widget.TextView r7 = r0.f
            r7.setVisibility(r9)
            java.lang.String r7 = r3.f
            boolean r10 = r4.a()
            if (r10 == 0) goto L_0x0138
            android.view.ViewGroup r10 = r0.e
            jrm r11 = new jrm
            r11.<init>(r0, r4)
            r10.setOnClickListener(r11)
        L_0x0138:
            android.view.ViewGroup r4 = r0.e
            r4.setVisibility(r9)
            jru r4 = defpackage.jru.a()
            r4.a = r7
            android.view.View r10 = r0.a
            android.content.Context r10 = r10.getContext()
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r9] = r7
            r7 = 2131954362(0x7f130aba, float:1.9545221E38)
            java.lang.String r7 = r10.getString(r7, r11)
            r4.f = r7
            android.view.View r7 = r0.a
            android.content.Context r7 = r7.getContext()
            r10 = 2131231824(0x7f080450, float:1.807974E38)
            android.graphics.drawable.Drawable r7 = defpackage.uj.b(r7, r10)
            r4.d = r7
            int r7 = r3.a
            r7 = r7 & r2
            if (r7 == 0) goto L_0x0194
            long r10 = r3.e
            android.view.View r7 = r0.a
            android.content.Context r7 = r7.getContext()
            java.lang.Object[] r14 = new java.lang.Object[r8]
            long r12 = java.lang.System.currentTimeMillis()
            r15 = 0
            r17 = 262144(0x40000, float:3.67342E-40)
            r8 = r14
            r14 = r15
            r16 = r17
            java.lang.CharSequence r10 = android.text.format.DateUtils.getRelativeTimeSpanString(r10, r12, r14, r16)
            java.lang.String r10 = r10.toString()
            r8[r9] = r10
            r10 = 2131953850(0x7f1308ba, float:1.9544183E38)
            java.lang.String r7 = r7.getString(r10, r8)
            r4.b = r7
            goto L_0x01a0
        L_0x0194:
            android.view.ViewGroup r7 = r0.e
            r8 = 2131429556(0x7f0b08b4, float:1.8480788E38)
            android.view.View r7 = r7.findViewById(r8)
            r7.setVisibility(r2)
        L_0x01a0:
            android.view.ViewGroup r7 = r0.e
            r4.a(r7)
            r7 = 1
            goto L_0x01b1
        L_0x01a7:
            android.widget.TextView r4 = r0.f
            r4.setVisibility(r2)
            android.view.ViewGroup r4 = r0.e
            r4.setVisibility(r2)
        L_0x01b1:
            int r3 = r3.a
            r4 = r3 & 2
            if (r4 != 0) goto L_0x01b9
            goto L_0x0234
        L_0x01b9:
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0234
            avid r3 = r1.b
            if (r3 == 0) goto L_0x01c2
            goto L_0x01c4
        L_0x01c2:
            avid r3 = defpackage.avid.h
        L_0x01c4:
            double r3 = r3.c
            avid r1 = r1.b
            if (r1 == 0) goto L_0x01cb
            goto L_0x01cd
        L_0x01cb:
            avid r1 = defpackage.avid.h
        L_0x01cd:
            double r10 = r1.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r8 = 49
            r1.<init>(r8)
            r1.append(r3)
            r1.append(r6)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r5)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r1 = android.net.Uri.encode(r1)
            r4[r9] = r1
            java.lang.String r1 = "https://maps.google.com/maps?daddr=%s"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r3.setData(r1)
            android.view.View r1 = r0.a
            android.content.Context r1 = r1.getContext()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.ComponentName r1 = r3.resolveActivity(r1)
            if (r1 == 0) goto L_0x022e
            com.google.android.gms.contactsheet.card.common.CardButton r1 = r0.d
            r4 = 2131952475(0x7f13035b, float:1.9541394E38)
            r1.a((int) r4)
            com.google.android.gms.contactsheet.card.common.CardButton r1 = r0.d
            r4 = 2131231797(0x7f080435, float:1.8079685E38)
            r1.b(r4)
            com.google.android.gms.contactsheet.card.common.CardButton r1 = r0.d
            r1.setVisibility(r9)
            com.google.android.gms.contactsheet.card.common.CardButton r1 = r0.d
            jrn r4 = new jrn
            r4.<init>(r0, r3)
            r1.setOnClickListener(r4)
            goto L_0x0239
        L_0x022e:
            com.google.android.gms.contactsheet.card.common.CardButton r1 = r0.d
            r1.setVisibility(r2)
            goto L_0x0239
        L_0x0234:
            com.google.android.gms.contactsheet.card.common.CardButton r1 = r0.d
            r1.setVisibility(r2)
        L_0x0239:
            if (r7 != 0) goto L_0x0241
            android.view.View r1 = r0.a
            r1.setVisibility(r2)
            return
        L_0x0241:
            android.view.View r1 = r0.a
            r1.setVisibility(r9)
            return
        L_0x0247:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrq.a(amri):void");
    }
}
