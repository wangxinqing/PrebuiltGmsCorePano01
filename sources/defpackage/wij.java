package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.net.PlayServicesCronetProvider;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: wij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wij {
    public static File a(Context context) {
        File file = new File(context.getCacheDir(), "nearby/sharing/images");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static String a(Context context, String str, CharSequence charSequence) {
        int integer = context.getResources().getInteger(R.integer.sharing_max_name_length_bytes);
        int a = whu.a(context.getString(R.string.sharing_default_device_name, new Object[]{"", charSequence}));
        if (a < integer) {
            return wih.a(str, integer - a);
        }
        ((anih) ((anih) vvj.a.c()).a("wij", "a", 305, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Device type string is longer than char limit.");
        return null;
    }

    public static String b(Context context) {
        String string = Settings.Global.getString(context.getContentResolver(), "device_name");
        if (TextUtils.isEmpty(string)) {
            string = Settings.System.getString(context.getContentResolver(), "device_name");
            if (TextUtils.isEmpty(string)) {
                string = Settings.System.getString(context.getContentResolver(), "bluetooth_name");
                if (TextUtils.isEmpty(string)) {
                    string = Settings.Secure.getString(context.getContentResolver(), "bluetooth_name");
                    if (TextUtils.isEmpty(string)) {
                        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                        if (defaultAdapter != null) {
                            string = defaultAdapter.getName();
                        } else {
                            string = null;
                        }
                        if (TextUtils.isEmpty(string)) {
                            string = Build.MODEL;
                        }
                    }
                }
            }
        }
        return wih.a(string, ((vt) context).a().getInteger(R.integer.sharing_max_name_length_bytes));
    }

    private static boolean a(Context context, String str, File file) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            new PlayServicesCronetProvider(context).createBuilder().build().newUrlRequestBuilder(str, new wii(file, countDownLatch), tid.c()).build().start();
            try {
                countDownLatch.await(ayni.a.a().M(), TimeUnit.MILLISECONDS);
                return true;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                jjg jjg = vvj.a;
                return false;
            }
        } catch (IllegalStateException e2) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("wij", "a", 131, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to download Url %s. Cronet provider is unavailable on this device.", (Object) str);
            return false;
        }
    }

    public static boolean a(String str) {
        try {
            return new URL(str).getHost().matches("lh[3-6].googleusercontent.com");
        } catch (MalformedURLException e) {
            return false;
        }
    }
}
