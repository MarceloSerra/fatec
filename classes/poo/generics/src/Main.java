public class Main {
    public static void main(String[] args) {

        IConcreteFoo concreteFooArg = new ConcreteFoo();
        IConcreteBar concreteBarArg = new ConcreteBar();

        // IGenericUseCase<IConcreteFoo> genericUseCase = new GenericUseCase<>();
        IGenericUseCase<IConcreteBar> genericUseCase = new GenericUseCase<>();

        genericUseCase.execute(concreteBarArg);
    }
}