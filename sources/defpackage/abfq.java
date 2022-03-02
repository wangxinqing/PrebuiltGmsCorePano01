package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.view.View;
import com.google.android.chimera.Fragment;

/* renamed from: abfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abfq implements View.OnClickListener {
    final /* synthetic */ abfr a;
    final /* synthetic */ abft b;

    public abfq(abft abft, abfr abfr) {
        this.b = abft;
        this.a = abfr;
    }

    public void onClick(View view) {
        Fragment fragment = this.b.a;
        String str = this.a.b;
        Intent intent = new Intent("android.intent.action.EDIT");
        intent.setDataAndType(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, str), "vnd.android.cursor.item/contact");
        int i = Build.VERSION.SDK_INT;
        intent.putExtra("finishActivityOnSaveCompleted", true);
        fragment.startActivity(intent);
    }
}
