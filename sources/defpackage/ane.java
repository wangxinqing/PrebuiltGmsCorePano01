package defpackage;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* renamed from: ane  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ane implements View.OnKeyListener {
    final /* synthetic */ SeekBarPreference a;

    public ane(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            SeekBarPreference seekBarPreference = this.a;
            if (!((!seekBarPreference.e && (i == 21 || i == 22)) || i == 23 || i == 66)) {
                SeekBar seekBar = seekBarPreference.d;
                if (seekBar != null) {
                    return seekBar.onKeyDown(i, keyEvent);
                }
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
        }
        return false;
    }
}
