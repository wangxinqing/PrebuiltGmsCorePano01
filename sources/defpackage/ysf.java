package defpackage;

import android.content.Intent;

/* renamed from: ysf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ysf {
    public static final Intent a(String str, String str2, String str3, String str4, String str5, int i) {
        Intent intent = new Intent("com.google.android.gms.plus.circles.ACTION_ADD_TO_CIRCLE_CONSENT").setPackage("com.google.android.gms");
        iva.a(str, (Object) "accountName");
        Intent putExtra = intent.putExtra("com.google.android.gms.plus.circles.EXTRA_ACCOUNT_NAME", str).putExtra("com.google.android.gms.plus.circles.EXTRA_PAGE_ID", str2);
        iva.a(str3, (Object) "consentHtml");
        Intent putExtra2 = putExtra.putExtra("com.google.android.gms.plus.circles.EXTRA_CONSENT_HTML", str3);
        iva.a(str4, (Object) "titleText");
        Intent putExtra3 = putExtra2.putExtra("com.google.android.gms.plus.circles.EXTRA_TITLE_TEXT", str4);
        iva.a(str5, (Object) "buttonText");
        return putExtra3.putExtra("com.google.android.gms.plus.circles.EXTRA_BUTTON_TEXT", str5).putExtra("com.google.android.gms.plus.circles.EXTRA_APPLICATION_ID", i);
    }
}
