package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.identity.common.ui.util.UiTextUtil$1;
import java.net.URISyntaxException;

/* renamed from: qcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qcn {
    public static final /* synthetic */ int a = 0;
    private static final iwd b = new iwd("Identity", "UiTextUtil");

    public static void a(Context context, SpannableStringBuilder spannableStringBuilder, String str, String str2, Resources.Theme theme, int i, int i2, View.OnClickListener onClickListener) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(str);
        spannableStringBuilder.setSpan(new UiTextUtil$1(str2, theme, i, i2, onClickListener, context), length, spannableStringBuilder.length(), 33);
    }

    public static void a(Context context, String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            if (context.getPackageManager().queryIntentActivities(parseUri, 0).isEmpty()) {
                Toast.makeText(context, context.getResources().getString(R.string.common_no_browser_found), 1).show();
                b.e("No handler found for credentials management url", new Object[0]);
                return;
            }
            context.startActivity(parseUri);
        } catch (URISyntaxException e) {
            b.e("Failed to parse the url", new Object[0]);
        }
    }
}
