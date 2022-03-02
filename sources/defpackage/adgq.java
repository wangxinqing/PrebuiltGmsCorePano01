package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.google.android.gms.R;
import com.google.android.gms.udc.ui.UdcAuthUrlSpan;
import java.util.ArrayList;

/* renamed from: adgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adgq {
    private static final jjg b = jjg.a();
    public ArrayList a;
    private final adgw c;

    public adgq() {
        this((adgw) null);
    }

    public static TextView a(View view, int i) {
        iva.a((Object) view, (Object) "Root view must not be null");
        try {
            TextView textView = (TextView) view.findViewById(i);
            if (textView == null) {
                ((anih) ((anih) b.b()).a("adgq", "a", 213, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Tried setting text, but couldn't find view");
            }
            return textView;
        } catch (ClassCastException e) {
            anih anih = (anih) b.b();
            anih.a((Throwable) e);
            ((anih) anih.a("adgq", "a", 218, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Tried setting text, but not on a TextView");
            return null;
        }
    }

    public static boolean a(atzn atzn) {
        return atzn == null || (atzn.a & 2) == 0;
    }

    public final void b(atzn atzn) {
        ArrayList arrayList = this.a;
        if (arrayList != null && atzn != null && (atzn.a & 1) != 0) {
            arrayList.add(atzn.b.k());
        }
    }

    public adgq(adgw adgw) {
        this.c = adgw;
    }

    private final TextView a(View view, int i, atzn atzn, boolean z, String str) {
        TextView a2 = a(view, i);
        if (a2 == null) {
            return null;
        }
        a(a2, atzn, z, str);
        return a2;
    }

    public static audx a(Intent intent, String str, auef auef) {
        return a(intent.getByteArrayExtra(str), auef);
    }

    public static audx a(Bundle bundle, String str, auef auef) {
        return a(bundle.getByteArray(str), auef);
    }

    public static audx a(byte[] bArr, auef auef) {
        if (bArr == null) {
            return null;
        }
        try {
            return (audx) auef.a(bArr);
        } catch (auda e) {
            anih anih = (anih) b.b();
            anih.a((Throwable) e);
            ((anih) anih.a("adgq", "a", 73, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error unbundling proto");
            return null;
        }
    }

    public static void a(Intent intent, String str, audx audx) {
        intent.putExtra(str, audx != null ? audx.k() : null);
    }

    public static void a(Bundle bundle, String str, audx audx) {
        bundle.putByteArray(str, audx != null ? audx.k() : null);
    }

    public static void a(View view, CharSequence charSequence) {
        Context context = null;
        if (!(view == null || view.getContext() == null)) {
            context = view.getContext().getApplicationContext();
        }
        if (context != null && !TextUtils.isEmpty(charSequence)) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                int i = Build.VERSION.SDK_INT;
                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                obtain.getText().add(charSequence);
                obtain.setEnabled(view.isEnabled());
                obtain.setClassName(view.getClass().getName());
                obtain.setPackageName(context.getPackageName());
                new qw(obtain).a(view);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    public final TextView a(View view, int i, atzn atzn) {
        return a(view, i, atzn, false, (String) null);
    }

    public final NetworkImageView a(View view, int i, atzf atzf, ImageLoader imageLoader) {
        NetworkImageView networkImageView;
        iva.a((Object) view, (Object) "Root view must not be null");
        iva.a((Object) atzf, (Object) "Image resource must not be null");
        try {
            networkImageView = (NetworkImageView) view.findViewById(i);
        } catch (ClassCastException e) {
            anih anih = (anih) b.b();
            anih.a((Throwable) e);
            ((anih) anih.a("adgq", "a", 266, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Found view, but not a LoadingImageView");
            networkImageView = null;
        }
        if (networkImageView != null && !atzf.c.isEmpty()) {
            networkImageView.setImageUrl(atzf.c, imageLoader);
            networkImageView.setVisibility(0);
            ArrayList arrayList = this.a;
            if (!(arrayList == null || atzf == null || (atzf.a & 1) == 0)) {
                arrayList.add(atzf.b.k());
            }
            return networkImageView;
        }
        ((anih) ((anih) b.b()).a("adgq", "a", 275, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Tried loading image, but couldn't find view");
        return null;
    }

    public final void a(View view, atzn atzn, String str) {
        a(view, R.id.text, atzn, true, str);
    }

    public final void a(TextView textView, atzn atzn, boolean z, String str) {
        if (!a(atzn) && a(textView, atzn.c, z, str)) {
            b(atzn);
        }
    }

    public final boolean a(TextView textView, String str, boolean z, String str2) {
        iva.b(!z ? true : str2 != null);
        Spanned a2 = adfm.a(str, this.c);
        if (z && !TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a2)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a2);
            for (UdcAuthUrlSpan udcAuthUrlSpan : (UdcAuthUrlSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), UdcAuthUrlSpan.class)) {
                if (udcAuthUrlSpan.a) {
                    udcAuthUrlSpan.b = str2;
                }
            }
            a2 = spannableStringBuilder;
        }
        if (TextUtils.isEmpty(a2)) {
            ((anih) ((anih) b.c()).a("adgq", "a", 234, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Tried setting text, but text was empty");
            return false;
        }
        if (z && (a2 instanceof Spanned) && ((ClickableSpan[]) a2.getSpans(0, a2.length(), ClickableSpan.class)).length > 0) {
            textView.setLinksClickable(true);
            textView.setAutoLinkMask(0);
            if (!(textView.getMovementMethod() instanceof LinkMovementMethod)) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        textView.setText(a2);
        textView.setVisibility(0);
        return true;
    }
}
