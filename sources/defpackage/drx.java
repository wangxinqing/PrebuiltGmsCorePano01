package defpackage;

import android.os.Bundle;
import android.os.Message;
import android.util.Pair;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import com.google.android.gms.app.settings.OpenSourceLicensesChimeraActivity;

/* renamed from: drx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class drx implements Runnable {
    final /* synthetic */ OpenSourceLicensesChimeraActivity a;

    public drx(OpenSourceLicensesChimeraActivity openSourceLicensesChimeraActivity) {
        this.a = openSourceLicensesChimeraActivity;
    }

    public final void run() {
        OpenSourceLicensesChimeraActivity openSourceLicensesChimeraActivity = this.a;
        StringBuilder sb = new StringBuilder();
        try {
            for (String append : ModuleManager.get(openSourceLicensesChimeraActivity).getThirdPartyLicenses().values()) {
                sb.append(append);
            }
        } catch (InvalidConfigException e) {
            sb.append(openSourceLicensesChimeraActivity.getString(R.string.unable_to_retrieve_licenses));
        }
        anhk i = OpenSourceLicensesChimeraActivity.a.listIterator();
        while (i.hasNext()) {
            Pair pair = (Pair) i.next();
            OpenSourceLicensesChimeraActivity.a(openSourceLicensesChimeraActivity, (String) pair.first, sb, String.format("\n\n---%s Open Source Licenses---\n", new Object[]{(String) pair.second}));
        }
        String sb2 = sb.toString();
        Message obtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("license", sb2);
        obtain.setData(bundle);
        this.a.b.sendMessage(obtain);
        this.a.c.shutdown();
    }
}
