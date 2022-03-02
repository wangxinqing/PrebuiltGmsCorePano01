package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: dqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dqy implements View.OnClickListener {
    final /* synthetic */ drb a;

    public dqy(drb drb) {
        this.a = drb;
    }

    public void onClick(View view) {
        try {
            drb drb = this.a;
            SimpleDateFormat simpleDateFormat = drb.a;
            String valueOf = String.valueOf(drb.e.getText());
            String valueOf2 = String.valueOf(this.a.g.getText());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(valueOf2);
            Date parse = simpleDateFormat.parse(sb.toString());
            drb drb2 = this.a;
            SimpleDateFormat simpleDateFormat2 = drb2.a;
            String valueOf3 = String.valueOf(drb2.f.getText());
            String valueOf4 = String.valueOf(this.a.h.getText());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 1 + String.valueOf(valueOf4).length());
            sb2.append(valueOf3);
            sb2.append(" ");
            sb2.append(valueOf4);
            if (!this.a.a(parse, simpleDateFormat2.parse(sb2.toString()))) {
                this.a.c();
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "WirelessRadioActivitySummary.txt");
                drb drb3 = this.a;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                intent.setType("text/plain");
                drb3.startActivity(intent);
            }
        } catch (ParseException e) {
            Log.e("ShareRadioActivity", "Failed to parse text when creating start or end date", e);
        }
    }
}
