package com.google.android.gms.icing.ui;

import android.content.Intent;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.libraries.material.progress.MaterialProgressBar;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SettingsContainerChimeraActivity extends bjs {
    private pub a;

    public final boolean aF() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            finish();
            return true;
        }
        getSupportFragmentManager().popBackStack();
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r0 = r0.getAction()
            if (r0 != 0) goto L_0x0013
            java.lang.String r7 = "SettingsContainerChimeraActivity received a null action."
            defpackage.oso.b(r7)
            return
        L_0x0013:
            oyq r1 = new oyq
            android.content.Context r2 = r6.getApplicationContext()
            r1.<init>(r2)
            int r2 = r0.hashCode()
            r3 = -1422852856(0xffffffffab30fd08, float:-6.287891E-13)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L_0x0046
            r3 = -60840178(0xfffffffffc5fa70e, float:-4.645082E36)
            if (r2 == r3) goto L_0x003c
            r3 = 2063728496(0x7b01ff70, float:6.749872E35)
            if (r2 == r3) goto L_0x0032
            goto L_0x0050
        L_0x0032:
            java.lang.String r2 = "com.google.android.gms.icing.APP_INDEXING_DEBUG"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0050
            r2 = 0
            goto L_0x0051
        L_0x003c:
            java.lang.String r2 = "com.google.android.gms.icing.ON_DEVICE_SHARING_UI"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0050
            r2 = 2
            goto L_0x0051
        L_0x0046:
            java.lang.String r2 = "com.google.android.gms.icing.PRIVACY_SETTINGS"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0050
            r2 = 1
            goto L_0x0051
        L_0x0050:
            r2 = -1
        L_0x0051:
            if (r2 == 0) goto L_0x0083
            if (r2 == r5) goto L_0x006d
            if (r2 == r4) goto L_0x0072
            java.lang.String r7 = "SettingsContainerChimeraActivity received unknown intent action: "
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0065
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7)
            goto L_0x0069
        L_0x0065:
            java.lang.String r0 = r7.concat(r0)
        L_0x0069:
            defpackage.oso.b(r0)
            return
        L_0x006d:
            r7 = 8003(0x1f43, float:1.1215E-41)
            r1.b(r7)
        L_0x0072:
            r7 = 8005(0x1f45, float:1.1217E-41)
            r1.b(r7)
            pub r7 = r6.a
            if (r7 != 0) goto L_0x00b8
            pub r7 = new pub
            r7.<init>(r6)
            r6.a = r7
            return
        L_0x0083:
            r0 = 2131623999(0x7f0e003f, float:1.8875165E38)
            r6.setContentView((int) r0)
            if (r7 != 0) goto L_0x00a4
            com.google.android.chimera.FragmentManager r7 = r6.getSupportFragmentManager()
            com.google.android.chimera.FragmentTransaction r7 = r7.beginTransaction()
            pwe r0 = new pwe
            r0.<init>()
            r2 = 2131427920(0x7f0b0250, float:1.847747E38)
            java.lang.String r3 = "packagesFragment"
            com.google.android.chimera.FragmentTransaction r7 = r7.add(r2, r0, r3)
            r7.commit()
        L_0x00a4:
            agvx r7 = defpackage.ozx.k
            java.lang.Object r7 = r7.c()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x00b8
            r7 = 7003(0x1b5b, float:9.813E-42)
            r1.b(r7)
            return
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.icing.ui.SettingsContainerChimeraActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        setIntent(intent);
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("query");
            pvi pvi = (pvi) getSupportFragmentManager().findFragmentByTag("indexablesFragment");
            if (pvi != null) {
                pvi.a(stringExtra);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        pub pub = this.a;
        if (pub != null) {
            pub.b = true;
            pub.a.setTitle((int) R.string.on_device_sharing_title);
            pub.a.setContentView((int) R.layout.on_device_sharing_activity);
            pub.c = pub.a.getPackageManager();
            pub.d = new jmz(pub.a);
            pub.i = ((jmz) pub.d).a((CharSequence) pub.a.getString(R.string.on_device_sharing_ui_header), 0);
            pub.d.a(pub.a.getWindow());
            pub.e = (MaterialProgressBar) pub.a.findViewById(R.id.progress);
            pub.f = (TextView) pub.a.findViewById(R.id.empty);
            pub.f.setText(R.string.on_device_sharing_ui_empty);
            pub.g = (TextView) pub.a.findViewById(R.id.error);
            pub.g.setText(R.string.on_device_sharing_ui_error);
            new ptu(pub).execute(new Void[0]);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        pub pub = this.a;
        if (pub != null) {
            pub.b = false;
        }
    }
}
