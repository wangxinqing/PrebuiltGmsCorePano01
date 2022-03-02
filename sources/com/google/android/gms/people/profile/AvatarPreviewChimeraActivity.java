package com.google.android.gms.people.profile;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.Closeable;
import java.io.OutputStream;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AvatarPreviewChimeraActivity extends FragmentActivity implements View.OnClickListener {
    private Uri a;
    private AvatarView b;

    private final void a() {
        Toast.makeText(this, R.string.people_avatar_error, 0).show();
        setResult(1);
        finish();
    }

    public void onClick(View view) {
        OutputStream outputStream;
        int id = view.getId();
        if (id == R.id.cancel_button) {
            setResult(0);
            finish();
        } else if (id == R.id.accept_button) {
            Uri a2 = xix.a(this, "cropped-avatar.jpg");
            if (a2 == null) {
                Log.w("People.Avatar", "Failed to get temp file to crop photo");
                a();
                return;
            }
            try {
                AvatarView avatarView = this.b;
                float f = 256.0f / ((float) (avatarView.d.right - avatarView.d.left));
                int i = -avatarView.d.left;
                int i2 = -avatarView.d.top;
                Bitmap createBitmap = Bitmap.createBitmap(PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(avatarView.getResources().getColor(R.color.people_avatar_preview_background));
                Matrix matrix = new Matrix(avatarView.b);
                if (i + i2 != 0) {
                    matrix.postTranslate((float) i, (float) i2);
                }
                if (f + f != 0.0f) {
                    matrix.postScale(f, f);
                }
                canvas.concat(matrix);
                avatarView.a.draw(canvas);
                try {
                    outputStream = avatarView.getContext().getContentResolver().openOutputStream(a2);
                    try {
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, (int) aywy.j(), outputStream);
                        jjt.a((Closeable) outputStream);
                        Intent intent = new Intent();
                        intent.putExtra("com.google.android.gms.people.profile.EXTRA_URI", a2);
                        setResult(-1, intent);
                        finish();
                    } catch (Throwable th) {
                        th = th;
                        jjt.a((Closeable) outputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                    jjt.a((Closeable) outputStream);
                    throw th;
                }
            } catch (Exception e) {
                Log.e("People.Avatar", "Failed to write cropped photo", e);
                a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        if (r3 != ((android.graphics.drawable.BitmapDrawable) r2).getBitmap()) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            if (r7 != 0) goto L_0x0018
            android.content.Intent r7 = r6.getIntent()
            android.os.Bundle r7 = r7.getExtras()
            java.lang.String r0 = "com.google.android.gms.people.profile.EXTRA_URI"
            android.os.Parcelable r7 = r7.getParcelable(r0)
            android.net.Uri r7 = (android.net.Uri) r7
            r6.a = r7
            goto L_0x0023
        L_0x0018:
            java.lang.String r0 = "photo_uri"
            android.os.Parcelable r7 = r7.getParcelable(r0)
            android.net.Uri r7 = (android.net.Uri) r7
            r6.a = r7
        L_0x0023:
            r7 = 2131624123(0x7f0e00bb, float:1.8875417E38)
            r6.setContentView((int) r7)
            r7 = 2131427621(0x7f0b0125, float:1.8476863E38)
            android.view.View r7 = r6.findViewById(r7)
            com.google.android.gms.people.profile.AvatarView r7 = (com.google.android.gms.people.profile.AvatarView) r7
            r6.b = r7
            r0 = 0
            r1 = 1
            android.net.Uri r2 = r6.a     // Catch:{ RuntimeException -> 0x00e4 }
            r7.a()     // Catch:{ RuntimeException -> 0x00e4 }
            long r3 = defpackage.aywy.k()     // Catch:{ RuntimeException -> 0x00e4 }
            int r4 = (int) r3     // Catch:{ RuntimeException -> 0x00e4 }
            android.content.Context r3 = r7.getContext()     // Catch:{ RuntimeException -> 0x00e4 }
            android.graphics.Bitmap r3 = defpackage.jju.a(r3, r2, r4, r4, r1)     // Catch:{ RuntimeException -> 0x00e4 }
            if (r3 == 0) goto L_0x00bf
            android.graphics.drawable.Drawable r2 = r7.a     // Catch:{ RuntimeException -> 0x00e4 }
            if (r2 == 0) goto L_0x0085
            r4 = 0
            r2.setCallback(r4)     // Catch:{ RuntimeException -> 0x00e4 }
            android.graphics.drawable.Drawable r2 = r7.a     // Catch:{ RuntimeException -> 0x00e4 }
            boolean r4 = r2 instanceof android.graphics.drawable.BitmapDrawable     // Catch:{ RuntimeException -> 0x00e4 }
            if (r4 != 0) goto L_0x0059
            goto L_0x0061
        L_0x0059:
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2     // Catch:{ RuntimeException -> 0x00e4 }
            android.graphics.Bitmap r2 = r2.getBitmap()     // Catch:{ RuntimeException -> 0x00e4 }
            if (r3 == r2) goto L_0x00a0
        L_0x0061:
            android.graphics.drawable.Drawable r2 = r7.a     // Catch:{ RuntimeException -> 0x00e4 }
            int r2 = r2.getIntrinsicWidth()     // Catch:{ RuntimeException -> 0x00e4 }
            int r4 = r3.getWidth()     // Catch:{ RuntimeException -> 0x00e4 }
            if (r2 != r4) goto L_0x007d
            android.graphics.drawable.Drawable r2 = r7.a     // Catch:{ RuntimeException -> 0x00e4 }
            int r2 = r2.getIntrinsicHeight()     // Catch:{ RuntimeException -> 0x00e4 }
            int r4 = r3.getHeight()     // Catch:{ RuntimeException -> 0x00e4 }
            if (r2 == r4) goto L_0x007b
            r2 = 1
            goto L_0x007e
        L_0x007b:
            r2 = 0
            goto L_0x007e
        L_0x007d:
            r2 = 1
        L_0x007e:
            r4 = 0
            r7.m = r4     // Catch:{ RuntimeException -> 0x00e4 }
            r7.a()     // Catch:{ RuntimeException -> 0x00e4 }
            goto L_0x0086
        L_0x0085:
            r2 = 0
        L_0x0086:
            android.graphics.drawable.Drawable r4 = r7.a     // Catch:{ RuntimeException -> 0x00e4 }
            if (r4 != 0) goto L_0x009a
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable     // Catch:{ RuntimeException -> 0x00e4 }
            android.content.res.Resources r5 = r7.getResources()     // Catch:{ RuntimeException -> 0x00e4 }
            r4.<init>(r5, r3)     // Catch:{ RuntimeException -> 0x00e4 }
            r7.a = r4     // Catch:{ RuntimeException -> 0x00e4 }
            android.graphics.drawable.Drawable r3 = r7.a     // Catch:{ RuntimeException -> 0x00e4 }
            r3.setCallback(r7)     // Catch:{ RuntimeException -> 0x00e4 }
        L_0x009a:
            r7.a((boolean) r2)     // Catch:{ RuntimeException -> 0x00e4 }
            r7.invalidate()     // Catch:{ RuntimeException -> 0x00e4 }
        L_0x00a0:
            r7.requestLayout()     // Catch:{ RuntimeException -> 0x00e4 }
            r7.invalidate()     // Catch:{ RuntimeException -> 0x00e4 }
            com.google.android.gms.people.profile.AvatarView r7 = r6.b
            r7.i = r1
            r7 = 2131427705(0x7f0b0179, float:1.8477034E38)
            android.view.View r7 = r6.findViewById(r7)
            r7.setOnClickListener(r6)
            r7 = 2131427360(0x7f0b0020, float:1.8476334E38)
            android.view.View r7 = r6.findViewById(r7)
            r7.setOnClickListener(r6)
            return
        L_0x00bf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ RuntimeException -> 0x00e4 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ RuntimeException -> 0x00e4 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ RuntimeException -> 0x00e4 }
            int r3 = r3.length()     // Catch:{ RuntimeException -> 0x00e4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00e4 }
            int r3 = r3 + 22
            r4.<init>(r3)     // Catch:{ RuntimeException -> 0x00e4 }
            java.lang.String r3 = "No bitmap loaded from "
            r4.append(r3)     // Catch:{ RuntimeException -> 0x00e4 }
            r4.append(r2)     // Catch:{ RuntimeException -> 0x00e4 }
            java.lang.String r2 = r4.toString()     // Catch:{ RuntimeException -> 0x00e4 }
            r7.<init>(r2)     // Catch:{ RuntimeException -> 0x00e4 }
            throw r7     // Catch:{ RuntimeException -> 0x00e4 }
        L_0x00e4:
            r7 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r7 = r7.getMessage()
            r1[r0] = r7
            java.lang.String r7 = "People.Avatar"
            java.lang.String r0 = "Failed to initialize AvatarView: %s"
            defpackage.xdt.a((java.lang.String) r7, (java.lang.String) r0, (java.lang.Object[]) r1)
            r6.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.profile.AvatarPreviewChimeraActivity.onCreate(android.os.Bundle):void");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("photo_uri", this.a);
    }
}
