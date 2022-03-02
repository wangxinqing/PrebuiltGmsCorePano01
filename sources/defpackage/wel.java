package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.google.android.gms.R;

/* renamed from: wel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wel implements Runnable {
    private final wgu a;
    private final String b;

    public wel(wgu wgu, String str) {
        this.a = wgu;
        this.b = str;
    }

    public final void run() {
        wgu wgu = this.a;
        String str = this.b;
        ((ClipboardManager) wgu.f.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(wgu.f.getString(R.string.sharing_product_name), str));
        if (ayni.R()) {
            wgu.a(0, (int) R.string.sharing_toast_copied_to_clipboard, str);
        } else {
            Context context = wgu.f;
            Toast.makeText(context, context.getString(R.string.sharing_toast_copied_to_clipboard, new Object[]{str}), 0).show();
        }
        ((anih) ((anih) vvj.a.d()).a("wgu", "f", 2961, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Copied %s to clipboard", (Object) str);
    }
}
