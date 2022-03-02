package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Switch;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: oho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oho extends DialogFragment {
    public String a;
    public String b;
    public String c;
    public avmc d;
    ohr e;
    Switch f;
    public HelpConfig g;

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        if (!TextUtils.isEmpty(this.c) && (getActivity() instanceof nzu)) {
            okg.b((nzu) getActivity(), i, this.c);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog onCreateDialog(android.os.Bundle r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0041
            java.lang.String r0 = "setting_title"
            java.lang.String r0 = r6.getString(r0)
            r5.a = r0
            java.lang.String r0 = "setting_snippet"
            java.lang.String r0 = r6.getString(r0)
            r5.b = r0
            java.lang.String r0 = "metrics_url"
            java.lang.String r0 = r6.getString(r0)
            r5.c = r0
            java.lang.String r0 = "EXTRA_HELP_CONFIG"
            android.os.Parcelable r0 = r6.getParcelable(r0)
            com.google.android.gms.googlehelp.common.HelpConfig r0 = (com.google.android.gms.googlehelp.common.HelpConfig) r0
            r5.g = r0
            java.lang.String r0 = "setting_action_definition"
            byte[] r6 = r6.getByteArray(r0)
            aubs r0 = defpackage.aubs.c()     // Catch:{ auda -> 0x0039 }
            avmc r1 = defpackage.avmc.d     // Catch:{ auda -> 0x0039 }
            aucj r6 = defpackage.aucj.a((defpackage.aucj) r1, (byte[]) r6, (defpackage.aubs) r0)     // Catch:{ auda -> 0x0039 }
            avmc r6 = (defpackage.avmc) r6     // Catch:{ auda -> 0x0039 }
            r5.d = r6     // Catch:{ auda -> 0x0039 }
            goto L_0x0041
        L_0x0039:
            r6 = move-exception
            java.lang.String r0 = "gH_SettingActionDialog"
            java.lang.String r1 = "Failed to parse AndroidSettingDefinition proto"
            android.util.Log.e(r0, r1, r6)
        L_0x0041:
            ohr r6 = r5.e
            if (r6 != 0) goto L_0x004e
            ohr r6 = new ohr
            com.google.android.chimera.Activity r0 = r5.getActivity()
            r6.<init>(r0)
        L_0x004e:
            r5.e = r6
            java.lang.String r6 = r5.a
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r0 = 0
            if (r6 != 0) goto L_0x011e
            avmc r6 = r5.d
            if (r6 == 0) goto L_0x011e
            int r6 = r6.b
            int r6 = defpackage.avmb.a(r6)
            if (r6 == 0) goto L_0x011e
            r1 = 2
            if (r6 != r1) goto L_0x011e
            ohr r6 = r5.e
            avmc r1 = r5.d
            boolean r6 = r6.a((defpackage.avmc) r1)
            if (r6 == 0) goto L_0x011e
            com.google.android.chimera.Activity r6 = r5.getActivity()
            android.view.LayoutInflater r6 = r6.getLayoutInflater()
            r1 = 2131624445(0x7f0e01fd, float:1.887607E38)
            android.view.View r6 = r6.inflate(r1, r0)
            java.lang.String r1 = r5.a
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            r2 = 2131428538(0x7f0b04ba, float:1.8478723E38)
            android.view.View r2 = r6.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r1)
            r1 = 2131428537(0x7f0b04b9, float:1.8478721E38)
            android.view.View r1 = r6.findViewById(r1)
            android.widget.Switch r1 = (android.widget.Switch) r1
            r5.f = r1
            ohr r1 = r5.e
            avmc r2 = r5.d
            java.lang.Boolean r1 = r1.c(r2)
            if (r1 == 0) goto L_0x011e
            android.widget.Switch r2 = r5.f
            boolean r1 = r1.booleanValue()
            r2.setChecked(r1)
            android.widget.Switch r1 = r5.f
            ohl r2 = new ohl
            r2.<init>(r5)
            r1.setOnCheckedChangeListener(r2)
            r1 = 2131428536(0x7f0b04b8, float:1.847872E38)
            android.view.View r1 = r6.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = r5.b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 8
            if (r2 != 0) goto L_0x00d8
            java.lang.String r2 = r5.b
            android.text.Spanned r2 = android.text.Html.fromHtml(r2)
            r1.setText(r2)
            goto L_0x00dc
        L_0x00d8:
            r1.setVisibility(r3)
        L_0x00dc:
            r1 = 2131428535(0x7f0b04b7, float:1.8478717E38)
            android.view.View r1 = r6.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            ohr r2 = r5.e
            avmc r4 = r5.d
            android.content.Intent r2 = r2.b(r4)
            if (r2 == 0) goto L_0x00fb
            com.google.android.chimera.Activity r4 = r5.getActivity()
            boolean r4 = defpackage.jhg.a((android.content.Context) r4, (android.content.Intent) r2)
            if (r4 == 0) goto L_0x00fb
            r0 = r2
            goto L_0x00fc
        L_0x00fb:
        L_0x00fc:
            if (r0 == 0) goto L_0x0107
            ohm r2 = new ohm
            r2.<init>(r5, r0)
            r1.setOnClickListener(r2)
            goto L_0x010b
        L_0x0107:
            r1.setVisibility(r3)
        L_0x010b:
            r0 = 2131428534(0x7f0b04b6, float:1.8478715E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            ohn r1 = new ohn
            r1.<init>(r5)
            r0.setOnClickListener(r1)
            r0 = r6
            goto L_0x011f
        L_0x011e:
        L_0x011f:
            android.app.AlertDialog$Builder r6 = new android.app.AlertDialog$Builder
            com.google.android.chimera.Activity r1 = r5.getActivity()
            r6.<init>(r1)
            if (r0 != 0) goto L_0x0141
            r0 = 153(0x99, float:2.14E-43)
            r5.a(r0)
            r0 = 2131952322(0x7f1302c2, float:1.9541083E38)
            r6.setMessage(r0)
            ohk r0 = new ohk
            r0.<init>(r5)
            r1 = 2131952275(0x7f130293, float:1.9540988E38)
            r6.setPositiveButton(r1, r0)
            goto L_0x0144
        L_0x0141:
            r6.setView(r0)
        L_0x0144:
            android.app.AlertDialog r6 = r6.create()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oho.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }

    public final void onResume() {
        Boolean c2;
        super.onResume();
        if (this.f != null && (c2 = this.e.c(this.d)) != null) {
            this.f.setChecked(c2.booleanValue());
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.a)) {
            bundle.putString("setting_title", this.a);
        }
        if (!TextUtils.isEmpty(this.b)) {
            bundle.putString("setting_snippet", this.b);
        }
        avmc avmc = this.d;
        if (avmc != null) {
            bundle.putByteArray("setting_action_definition", avmc.k());
        }
        if (!TextUtils.isEmpty(this.c)) {
            bundle.putString("metrics_url", this.c);
        }
        HelpConfig helpConfig = this.g;
        if (helpConfig != null) {
            bundle.putParcelable("EXTRA_HELP_CONFIG", helpConfig);
        }
    }
}
