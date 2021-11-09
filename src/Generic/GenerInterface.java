package Generic;

public interface GenerInterface<U, R> {
    R getU(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);
    default R method(U u){
        return null;
    }
}
//当类继承泛型接口时，需要将其泛型进行类型指定
class impC implements GenerInterface<String,Integer>{

    @Override
    public Integer getU(String s) {
        return null;
    }

    @Override
    public void hi(Integer integer) {

    }

    @Override
    public void run(Integer r1, Integer r2, String u1, String u2) {

    }
}
//若不进行指定,会默认都是Object类型
class impA implements GenerInterface{

    @Override
    public Object getU(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}

//若是继承了已经指定类型了泛型接口，那么后续实现的该接口的类的类型也已经指定为这些类型
interface Myinterface extends GenerInterface<String,Integer>{

}

class impB implements Myinterface{

    @Override
    public Integer getU(String s) {
        return null;
    }

    @Override
    public void hi(Integer integer) {

    }

    @Override
    public void run(Integer r1, Integer r2, String u1, String u2) {

    }
}