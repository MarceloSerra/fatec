interface IGenericUseCase<T> {
    void execute(T arg);
}

public final class GenericUseCase<T> implements IGenericUseCase<T>{
    public void execute(T arg){
        //System.out.printf("[TYPE]: %s", arg.getClass());
    }
}

interface IResponse<T> {
    Boolean ok = null;
    T data = null;
}

final class Response<T> implements IResponse<T> {

    private ok;
    private data;

    public Response() {

    }
}
interface IGetResponse<T> {
    IResponse<T> execute(T arg);
}

public final class GetResponse<T> implements IGetResponse<T>{
    public IResponse<T> execute(T arg){
        //System.out.printf("[TYPE]: %s", arg.getClass());

        return ;
    }
}
