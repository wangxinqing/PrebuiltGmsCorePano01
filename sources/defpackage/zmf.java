package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.URLSpan;
import com.google.android.chimera.Activity;
import com.google.android.gms.plus.sharebox.MentionSpan;
import java.util.ArrayList;

/* renamed from: zmf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zmf {
    protected static String a(Context context, String str, String str2, String[] strArr) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        int length = strArr.length;
        if (length == 1) {
            return strArr[0];
        }
        if (a(str2)) {
            return "<<default account>>";
        }
        String string = context.getSharedPreferences("pref_com.google.android.gms.plus.sharebox", 0).getString("pref_global_account_name", (String) null);
        if (!TextUtils.isEmpty(string) || length == 0) {
            return string;
        }
        String str3 = strArr[0];
        a(context, str3, str2);
        return str3;
    }

    public static boolean b(Intent intent) {
        zmx a;
        if (a(intent) || (a = zmx.a(intent.getExtras())) == null || !a.d()) {
            return false;
        }
        return true;
    }

    public static boolean c(Intent intent) {
        if (intent != null) {
            return "com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE".equals(intent.getAction());
        }
        return false;
    }

    public static String a(Spannable spannable) {
        int i;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        ArrayList arrayList = new ArrayList();
        if (uRLSpanArr != null) {
            i = uRLSpanArr.length;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size + 1) {
                    break;
                }
                if (MentionSpan.a(uRLSpanArr[i2])) {
                    if (size <= i3) {
                        arrayList.add(uRLSpanArr[i2]);
                        break;
                    } else if (spannable.getSpanEnd(arrayList.get(i3)) > spannable.getSpanEnd(uRLSpanArr[i2])) {
                        arrayList.add(i3, uRLSpanArr[i2]);
                        break;
                    }
                }
                i3++;
            }
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size2);
        int[] iArr = new int[size2];
        int[] iArr2 = new int[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            String substring = ((URLSpan) arrayList.get(i4)).getURL().substring(1);
            if (substring.startsWith("g:")) {
                String valueOf = String.valueOf(substring.substring(2));
                arrayList2.add(valueOf.length() == 0 ? new String("+") : "+".concat(valueOf));
            } else if (substring.startsWith("e:")) {
                String valueOf2 = String.valueOf(substring.substring(2));
                arrayList2.add(valueOf2.length() == 0 ? new String("+") : "+".concat(valueOf2));
            } else {
                String valueOf3 = String.valueOf(substring);
                arrayList2.add(valueOf3.length() == 0 ? new String("+") : "+".concat(valueOf3));
            }
            iArr[i4] = spannable.getSpanStart(arrayList.get(i4));
            iArr2[i4] = spannable.getSpanEnd(arrayList.get(i4));
        }
        StringBuilder sb = new StringBuilder(spannable.toString());
        for (int i5 = size2 - 1; i5 >= 0; i5--) {
            sb.replace(iArr[i5], iArr2[i5], (String) arrayList2.get(i5));
        }
        return sb.toString();
    }

    public static String a(Activity activity) {
        Intent intent = activity.getIntent();
        String a = jhg.a(activity);
        if (!TextUtils.isEmpty(a)) {
            return (!hya.a((Context) activity).b(a) || !intent.hasExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE")) ? a : intent.getStringExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE");
        }
        return "com.google.android.gms";
    }

    public static void a(Context context, String str, String str2) {
        if (!a(str2)) {
            SharedPreferences.Editor edit = context.getSharedPreferences("pref_com.google.android.gms.plus.sharebox", 0).edit();
            edit.putString("pref_global_account_name", str);
            edit.apply();
        }
    }

    public static boolean a(Intent intent) {
        return intent.getBooleanExtra("com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST", false);
    }

    public static boolean a(Activity activity, String str) {
        Intent intent;
        if (activity == null || ((!c(activity.getIntent()) && ((intent = activity.getIntent()) == null || !"com.google.android.gms.plus.action.REPLY_INTERNAL_GOOGLE".equals(intent.getAction()))) || !"youTubeComments".equals(str))) {
            return false;
        }
        return true;
    }

    protected static boolean a(String str) {
        if (TextUtils.isEmpty(str) || "com.google.android.gms".equals(str)) {
            return false;
        }
        return true;
    }
}
