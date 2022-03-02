package defpackage;

import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jg extends jh {
    private final List c = new ArrayList();
    private jq d;
    private Boolean e;

    private jg() {
    }

    public final void a(Bundle bundle) {
        bundle.putCharSequence("android.selfDisplayName", this.d.a);
        bundle.putBundle("android.messagingStyleUser", this.d.a());
        bundle.putCharSequence("android.hiddenConversationTitle", (CharSequence) null);
        if (!this.c.isEmpty()) {
            List list = this.c;
            Bundle[] bundleArr = new Bundle[list.size()];
            int size = list.size();
            for (int i = 0; i < size; i++) {
                jf jfVar = (jf) list.get(i);
                Bundle bundle2 = new Bundle();
                CharSequence charSequence = jfVar.a;
                if (charSequence != null) {
                    bundle2.putCharSequence("text", charSequence);
                }
                bundle2.putLong("time", jfVar.b);
                bundle2.putCharSequence("sender", jfVar.c.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle2.putParcelable("sender_person", jfVar.c.b());
                } else {
                    bundle2.putBundle("person", jfVar.c.a());
                }
                bundle2.putBundle("extras", jfVar.d);
                bundleArr[i] = bundle2;
            }
            bundle.putParcelableArray("android.messages", bundleArr);
        }
        Boolean bool = this.e;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Deprecated
    public jg(CharSequence charSequence) {
        jp jpVar = new jp();
        jpVar.a = charSequence;
        this.d = jpVar.a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: jf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ja r20) {
        /*
            r19 = this;
            r0 = r19
            je r1 = r0.a
            r2 = 28
            r3 = 0
            if (r1 == 0) goto L_0x0019
            android.content.Context r1 = r1.a
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            int r1 = r1.targetSdkVersion
            if (r1 < r2) goto L_0x0014
            goto L_0x0019
        L_0x0014:
            java.lang.Boolean r1 = r0.e
            if (r1 != 0) goto L_0x0019
            goto L_0x0022
        L_0x0019:
            java.lang.Boolean r1 = r0.e
            if (r1 == 0) goto L_0x0022
            boolean r1 = r1.booleanValue()
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.e = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            r5 = 0
            if (r1 < r4) goto L_0x00a5
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r2) goto L_0x0040
            android.app.Notification$MessagingStyle r1 = new android.app.Notification$MessagingStyle
            jq r4 = r0.d
            android.app.Person r4 = r4.b()
            r1.<init>(r4)
            goto L_0x0049
        L_0x0040:
            android.app.Notification$MessagingStyle r1 = new android.app.Notification$MessagingStyle
            jq r4 = r0.d
            java.lang.CharSequence r4 = r4.a
            r1.<init>(r4)
        L_0x0049:
            java.lang.Boolean r4 = r0.e
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x0055
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L_0x0058
        L_0x0055:
            r1.setConversationTitle(r5)
        L_0x0058:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 >= r2) goto L_0x005d
            goto L_0x0066
        L_0x005d:
            java.lang.Boolean r4 = r0.e
            boolean r4 = r4.booleanValue()
            r1.setGroupConversation(r4)
        L_0x0066:
            java.util.List r4 = r0.c
            int r5 = r4.size()
        L_0x006c:
            if (r3 >= r5) goto L_0x009b
            java.lang.Object r6 = r4.get(r3)
            jf r6 = (defpackage.jf) r6
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r2) goto L_0x0088
            jq r7 = r6.c
            android.app.Notification$MessagingStyle$Message r8 = new android.app.Notification$MessagingStyle$Message
            java.lang.CharSequence r9 = r6.a
            long r10 = r6.b
            android.app.Person r6 = r7.b()
            r8.<init>(r9, r10, r6)
            goto L_0x0095
        L_0x0088:
            jq r7 = r6.c
            java.lang.CharSequence r7 = r7.a
            android.app.Notification$MessagingStyle$Message r8 = new android.app.Notification$MessagingStyle$Message
            java.lang.CharSequence r9 = r6.a
            long r10 = r6.b
            r8.<init>(r9, r10, r7)
        L_0x0095:
            r1.addMessage(r8)
            int r3 = r3 + 1
            goto L_0x006c
        L_0x009b:
            r2 = r20
            jj r2 = (defpackage.jj) r2
            android.app.Notification$Builder r2 = r2.a
            r1.setBuilder(r2)
            return
        L_0x00a5:
            java.util.List r1 = r0.c
            int r1 = r1.size()
            int r1 = r1 + -1
        L_0x00ad:
            if (r1 < 0) goto L_0x00c4
            java.util.List r2 = r0.c
            java.lang.Object r2 = r2.get(r1)
            jf r2 = (defpackage.jf) r2
            jq r4 = r2.c
            java.lang.CharSequence r4 = r4.a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x00dd
            int r1 = r1 + -1
            goto L_0x00ad
        L_0x00c4:
            java.util.List r1 = r0.c
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00dc
            java.util.List r1 = r0.c
            int r2 = r1.size()
            int r2 = r2 + -1
            java.lang.Object r1 = r1.get(r2)
            r2 = r1
            jf r2 = (defpackage.jf) r2
            goto L_0x00dd
        L_0x00dc:
            r2 = r5
        L_0x00dd:
            java.lang.String r1 = ""
            if (r2 == 0) goto L_0x00f3
            r4 = r20
            jj r4 = (defpackage.jj) r4
            android.app.Notification$Builder r6 = r4.a
            r6.setContentTitle(r1)
            jq r6 = r2.c
            android.app.Notification$Builder r4 = r4.a
            java.lang.CharSequence r6 = r6.a
            r4.setContentTitle(r6)
        L_0x00f3:
            if (r2 != 0) goto L_0x00f6
            goto L_0x0101
        L_0x00f6:
            r4 = r20
            jj r4 = (defpackage.jj) r4
            android.app.Notification$Builder r4 = r4.a
            java.lang.CharSequence r2 = r2.a
            r4.setContentText(r2)
        L_0x0101:
            int r2 = android.os.Build.VERSION.SDK_INT
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            java.util.List r4 = r0.c
            int r4 = r4.size()
            int r4 = r4 + -1
        L_0x0110:
            if (r4 < 0) goto L_0x0125
            java.util.List r6 = r0.c
            java.lang.Object r6 = r6.get(r4)
            jf r6 = (defpackage.jf) r6
            jq r6 = r6.c
            java.lang.CharSequence r6 = r6.a
            if (r6 == 0) goto L_0x0123
            int r4 = r4 + -1
            goto L_0x0110
        L_0x0123:
            r4 = 1
            goto L_0x0126
        L_0x0125:
            r4 = 0
        L_0x0126:
            java.util.List r6 = r0.c
            int r6 = r6.size()
            int r6 = r6 + -1
        L_0x012e:
            if (r6 < 0) goto L_0x01b6
            java.util.List r7 = r0.c
            java.lang.Object r7 = r7.get(r6)
            jf r7 = (defpackage.jf) r7
            if (r4 != 0) goto L_0x013d
            java.lang.CharSequence r7 = r7.a
            goto L_0x019f
        L_0x013d:
            nn r8 = defpackage.nn.a()
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>()
            int r10 = android.os.Build.VERSION.SDK_INT
            jq r10 = r7.c
            java.lang.CharSequence r10 = r10.a
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r11 == 0) goto L_0x0160
            jq r10 = r0.d
            java.lang.CharSequence r10 = r10.a
            je r11 = r0.a
            int r11 = r11.u
            if (r11 == 0) goto L_0x0160
            r12 = r11
            goto L_0x0161
        L_0x0160:
        L_0x0161:
            java.lang.CharSequence r10 = r8.a((java.lang.CharSequence) r10)
            r9.append(r10)
            android.text.style.TextAppearanceSpan r11 = new android.text.style.TextAppearanceSpan
            r14 = 0
            r15 = 0
            r16 = 0
            android.content.res.ColorStateList r17 = android.content.res.ColorStateList.valueOf(r12)
            r18 = 0
            r13 = r11
            r13.<init>(r14, r15, r16, r17, r18)
            int r12 = r9.length()
            int r10 = r10.length()
            int r12 = r12 - r10
            int r10 = r9.length()
            r13 = 33
            r9.setSpan(r11, r12, r10, r13)
            java.lang.CharSequence r7 = r7.a
            if (r7 == 0) goto L_0x018f
            goto L_0x0190
        L_0x018f:
            r7 = r1
        L_0x0190:
            java.lang.String r10 = "  "
            android.text.SpannableStringBuilder r10 = r9.append(r10)
            java.lang.CharSequence r7 = r8.a((java.lang.CharSequence) r7)
            r10.append(r7)
            r7 = r9
        L_0x019f:
            java.util.List r8 = r0.c
            int r8 = r8.size()
            int r8 = r8 + -1
            if (r6 == r8) goto L_0x01ae
            java.lang.String r8 = "\n"
            r2.insert(r3, r8)
        L_0x01ae:
            r2.insert(r3, r7)
            int r6 = r6 + -1
            goto L_0x012e
        L_0x01b6:
            android.app.Notification$BigTextStyle r1 = new android.app.Notification$BigTextStyle
            r3 = r20
            jj r3 = (defpackage.jj) r3
            android.app.Notification$Builder r3 = r3.a
            r1.<init>(r3)
            android.app.Notification$BigTextStyle r1 = r1.setBigContentTitle(r5)
            r1.bigText(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg.a(ja):void");
    }

    @Deprecated
    public final void a(CharSequence charSequence, long j, CharSequence charSequence2) {
        List list = this.c;
        jp jpVar = new jp();
        jpVar.a = charSequence2;
        list.add(new jf(charSequence, j, jpVar.a()));
        if (this.c.size() > 25) {
            this.c.remove(0);
        }
    }
}
