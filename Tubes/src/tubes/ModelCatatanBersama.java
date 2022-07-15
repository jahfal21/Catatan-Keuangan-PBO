package tubes;
import java.util.*;
/**
 *
 * @author angel
 */

public class ModelCatatanBersama {
    private int IDCatatanBersama;
    private int Pemasukan;
    private int Pengeluaran;
    private List<catatan> listcatatan;
    
    //innerclass daftar catatan
    public class catatan{
    //berisikan daftar catatan bersama, atribut"
        
}
      
            
    /*public List<catatan> getCatatan(){

        return this.daftarCatatan

    }*/
    
    public void setIDCatatanBersama(int IDCatatanBersama){
        this.IDCatatanBersama = IDCatatanBersama;
    }
    
    public void setPemasukan(int Pemasukan){
        this.Pemasukan = Pemasukan;
    }
    
    public void setPengeluaran(int Pengeluaran){
        this.Pengeluaran = Pengeluaran;
    }
    
    public int getIDCatatanBersama(){
        return IDCatatanBersama;
    }
        
    public int getPemasukan(){
        return Pemasukan;
    }
        
    public int getPengeluaran(){
        return Pengeluaran;
    }
}
