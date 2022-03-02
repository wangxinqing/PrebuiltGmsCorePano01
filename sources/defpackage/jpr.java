package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.contactsheet.SmartProfileUtil$1;
import java.util.Locale;

/* renamed from: jpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jpr {
    public static int a(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.8f;
        return Color.HSVToColor(fArr);
    }

    public static String b(String str) {
        Uri parse = Uri.parse(str);
        if ("https".equals(parse.getScheme()) || "http".equals(parse.getScheme())) {
            return str;
        }
        if (str.startsWith("//")) {
            String valueOf = String.valueOf(str);
            return valueOf.length() == 0 ? new String("https:") : "https:".concat(valueOf);
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() == 0 ? new String("https://") : "https://".concat(valueOf2);
    }

    public static String c(String str) {
        return !TextUtils.isEmpty(str) ? Uri.parse(str).getQueryParameter("plid") : str;
    }

    public static AlertDialog a(Context context, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str);
        builder.setPositiveButton(context.getResources().getString(R.string.profile_communicate_entry_copy_label), new jpq(context, str));
        return builder.create();
    }

    public static void b(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setDuration(100);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        int i2;
        int i3 = 0;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i, false);
        int width = createScaledBitmap.getWidth();
        int height = createScaledBitmap.getHeight();
        if (width < height) {
            i2 = (height / 2) - (width / 2);
        } else {
            i3 = (width / 2) - (height / 2);
            width = height;
            i2 = 0;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        float f = (float) (i / 2);
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(createScaledBitmap, (float) i3, (float) i2, paint);
        return createBitmap;
    }

    public static BitmapFactory.Options a() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        return options;
    }

    public static Drawable a(Drawable drawable, int i) {
        Drawable mutate = drawable.mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public static Spanned a(String str) {
        if (jkr.c()) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer a(android.content.Intent r6) {
        /*
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r6 == 0) goto L_0x0057
            java.lang.String r2 = "com.google.android.gms.people.smart_profile.THEME_COLOR"
            boolean r3 = r6.hasExtra(r2)
            if (r3 == 0) goto L_0x003a
            java.lang.String r2 = r6.getStringExtra(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x003a
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Failed to parse theme color "
            int r5 = r3.length()
            if (r5 != 0) goto L_0x002b
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
            goto L_0x002e
        L_0x002b:
            r4.concat(r3)
        L_0x002e:
            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ IllegalArgumentException -> 0x0037 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0037 }
            goto L_0x003b
        L_0x0037:
            r2 = move-exception
            r2 = r1
            goto L_0x003b
        L_0x003a:
            r2 = r1
        L_0x003b:
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = "com.google.android.gms.people.smart_profile.THEME_COLOR_INT"
            boolean r3 = r6.hasExtra(r1)
            if (r3 != 0) goto L_0x004b
            goto L_0x0055
        L_0x004b:
            int r6 = r6.getIntExtra(r1, r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L_0x0054:
        L_0x0055:
            r1 = r2
            goto L_0x0058
        L_0x0057:
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpr.a(android.content.Intent):java.lang.Integer");
    }

    public static void a(Context context, TextView textView, String str, String str2) {
        int i;
        String str3;
        int i2;
        if (TextUtils.isEmpty(str2)) {
            textView.setText(str);
            return;
        }
        if (nx.a(Locale.getDefault()) == 1) {
            String concat = String.valueOf(str2).concat(" • ");
            textView.setGravity(5);
            String valueOf = String.valueOf(concat);
            String valueOf2 = String.valueOf(str);
            str3 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            i2 = concat.length();
            i = 0;
        } else {
            String valueOf3 = String.valueOf(str2);
            String str4 = valueOf3.length() == 0 ? new String(" • ") : " • ".concat(valueOf3);
            String valueOf4 = String.valueOf(str);
            String valueOf5 = String.valueOf(str4);
            String str5 = valueOf5.length() == 0 ? new String(valueOf4) : valueOf4.concat(valueOf5);
            int length = str.length();
            i2 = str5.length();
            String str6 = str5;
            i = length;
            str3 = str6;
        }
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(R.dimen.card_entry_small_text_size)), i, i2, 0);
        spannableString.setSpan(new ForegroundColorSpan(kf.b(context, R.color.card_entry_light_text_color)), i, i2, 0);
        int i3 = Build.VERSION.SDK_INT;
        textView.setText(spannableString);
    }

    public static void a(Spannable spannable, int i) {
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new SmartProfileUtil$1(uRLSpan.getURL(), i), spanStart, spanEnd, 0);
        }
    }

    public static void a(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setDuration(200);
        view.setVisibility(0);
        view.startAnimation(alphaAnimation);
    }
}
