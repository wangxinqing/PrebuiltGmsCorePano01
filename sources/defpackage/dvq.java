package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.AppInviteChimeraActivity;
import java.util.ArrayList;

/* renamed from: dvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dvq implements View.OnClickListener {
    final /* synthetic */ AppInviteChimeraActivity a;

    public dvq(AppInviteChimeraActivity appInviteChimeraActivity) {
        this.a = appInviteChimeraActivity;
    }

    public void onClick(View view) {
        AppInviteChimeraActivity appInviteChimeraActivity = this.a;
        Intent intent = new Intent("com.google.android.gms.appinvite.ACTION_PREVIEW");
        intent.setPackage(appInviteChimeraActivity.b);
        intent.putExtra("com.google.android.gms.appinvite.LAYOUT_RES_ID", hdg.a(appInviteChimeraActivity, R.layout.appinvite_preview_activity));
        ArrayList arrayList = new ArrayList();
        intent.putExtra("com.google.android.gms.appinvite.VIEWS", arrayList);
        Bundle bundle = new Bundle();
        bundle.putInt("View_id", hdg.a(appInviteChimeraActivity, R.id.title));
        bundle.putBoolean("TextView_isTitle", true);
        arrayList.add(bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("View_id", hdg.a(appInviteChimeraActivity, R.id.title_container));
        bundle2.putInt("View_minHeight", appInviteChimeraActivity.d.getHeight());
        arrayList.add(bundle2);
        Bundle bundle3 = new Bundle();
        bundle3.putInt("View_id", hdg.a(appInviteChimeraActivity, R.id.title_close));
        bundle3.putCharSequence("View_onClickListener", "close");
        arrayList.add(bundle3);
        arrayList.add(appInviteChimeraActivity.a((int) R.id.email_subject, (CharSequence) appInviteChimeraActivity.getIntent().getStringExtra("com.google.android.gms.appinvite.EMAIL_SUBJECT")));
        arrayList.add(appInviteChimeraActivity.a((int) R.id.email_message, (CharSequence) appInviteChimeraActivity.f.getText()));
        Bundle bundle4 = new Bundle();
        bundle4.putInt("View_id", hdg.a(appInviteChimeraActivity, R.id.email_content));
        bundle4.putString("WebView_data", appInviteChimeraActivity.getIntent().getStringExtra("com.google.android.gms.appinvite.EMAIL_CONTENT"));
        arrayList.add(bundle4);
        if (intent.resolveActivity(appInviteChimeraActivity.getPackageManager()) != null) {
            appInviteChimeraActivity.startActivityForResult(intent, 0);
            appInviteChimeraActivity.overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);
        }
    }
}
