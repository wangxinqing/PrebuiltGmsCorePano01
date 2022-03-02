package com.google.firebase.auth.api.gms.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SmsCodeAutoRetriever extends nla {
    private static final iwd c = new iwd("FirebaseAuth", "SmsCodeAutoRetriever");
    public final Context a;
    public boolean b;
    private final Set d;
    private final List e = new ArrayList();
    private final apoy f;

    public SmsCodeAutoRetriever(Context context, apoy apoy) {
        super("firebase_auth");
        this.b = false;
        this.a = context;
        iva.a((Object) apoy);
        this.f = apoy;
        this.d = new HashSet(Arrays.asList(axic.a.a().i().split(",")));
        String h = axic.a.a().h();
        if (!TextUtils.isEmpty(h)) {
            for (String compile : h.split(",")) {
                this.e.add(Pattern.compile(compile));
            }
        }
    }

    public static boolean a() {
        if (!"unknown".equals(Build.BOARD)) {
            return false;
        }
        if ("generic".equals(Build.BRAND) || "generic_x86".equals(Build.BRAND) || "google".equals(Build.BRAND)) {
            return "generic".equals(Build.DEVICE) || "generic_x86".equals(Build.DEVICE) || "Android".equals(Build.DEVICE);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            android.telephony.SmsMessage[] r11 = android.provider.Telephony.Sms.Intents.getMessagesFromIntent(r11)
            if (r11 == 0) goto L_0x008e
            axic r0 = defpackage.axic.a
            axid r0 = r0.a()
            java.lang.String r0 = r0.g()
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x001e:
            int r4 = r11.length
            if (r2 >= r4) goto L_0x0084
            r3 = r11[r2]
            java.lang.String r3 = r3.getDisplayOriginatingAddress()
            r4 = 1
            if (r3 == 0) goto L_0x0053
            java.util.Set r5 = r9.d
            boolean r5 = r5.contains(r3)
            if (r5 != 0) goto L_0x0051
            java.util.List r5 = r9.e
            int r6 = r5.size()
            r7 = 0
        L_0x0039:
            if (r7 >= r6) goto L_0x0053
            int r8 = r7 + 1
            java.lang.Object r7 = r5.get(r7)
            java.util.regex.Pattern r7 = (java.util.regex.Pattern) r7
            java.util.regex.Matcher r7 = r7.matcher(r3)
            boolean r7 = r7.find()
            if (r7 != 0) goto L_0x004f
            r7 = r8
            goto L_0x0039
        L_0x004f:
            r3 = 1
            goto L_0x0054
        L_0x0051:
            r3 = 1
            goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            if (r3 == 0) goto L_0x0057
            goto L_0x0063
        L_0x0057:
            axic r4 = defpackage.axic.a
            axid r4 = r4.a()
            boolean r4 = r4.f()
            if (r4 != 0) goto L_0x0081
        L_0x0063:
            r4 = r11[r2]
            java.lang.String r4 = r4.getDisplayMessageBody()
            java.util.regex.Matcher r4 = r0.matcher(r4)
        L_0x006d:
            boolean r5 = r4.find()
            if (r5 == 0) goto L_0x007b
            java.lang.String r5 = r4.group()
            r10.add(r5)
            goto L_0x006d
        L_0x007b:
            boolean r4 = r10.isEmpty()
            if (r4 == 0) goto L_0x0084
        L_0x0081:
            int r2 = r2 + 1
            goto L_0x001e
        L_0x0084:
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x008d
            r9.a((java.util.List) r10, (boolean) r3)
        L_0x008d:
            return
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.api.gms.internal.SmsCodeAutoRetriever.a(android.content.Context, android.content.Intent):void");
    }

    public final void a(List list, boolean z) {
        if (!this.b) {
            c.f("Trying to unregister for sms broadcast receiving, but no receiver isregistered", new Object[0]);
        } else {
            this.a.unregisterReceiver(this);
            this.b = false;
        }
        if (list != null) {
            apoy apoy = this.f;
            jfo jfo = apoy.b.b;
            jfo.sendMessage(jfo.obtainMessage(2, new Object[]{apoy.a, list.get(0), Boolean.valueOf(z)}));
        }
    }
}
