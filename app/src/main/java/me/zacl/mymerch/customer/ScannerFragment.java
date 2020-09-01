package me.zacl.mymerch.customer;

import android.os.Bundle;
import android.view.*;
import androidx.fragment.app.Fragment;
import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

public class ScannerFragment extends Fragment {

   private SurfaceView surfaceView;

   private BarcodeDetector barcodeDetector;
   private CameraSource    cameraSource;

   public ScannerFragment() {
   }

   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      surfaceView = getView().findViewById(R.id.surfaceView);

      barcodeDetector = new BarcodeDetector.Builder(getContext()).setBarcodeFormats(Barcode.QR_CODE)
                                                                 .build();
      cameraSource = new CameraSource.Builder(getContext(), barcodeDetector).build();

      surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
         @Override
         public void surfaceCreated(SurfaceHolder holder) {

         }

         @Override
         public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

         }

         @Override
         public void surfaceDestroyed(SurfaceHolder holder) {

         }
      });

   }

   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {
      // Inflate the layout for this fragment
      return inflater.inflate(R.layout.fragment_scanner, container, false);
   }
}