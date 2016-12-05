package io.soramitsu.irohaandroid.domain.interactor;

import io.soramitsu.irohaandroid.domain.executor.PostExecutionThread;
import io.soramitsu.irohaandroid.domain.executor.ThreadExecutor;
import io.soramitsu.irohaandroid.domain.repository.KeyPairRepository;
import rx.Observable;

public class RegisterKeyPairUseCase extends UseCase {

    private KeyPairRepository keyPairRepository;

    public RegisterKeyPairUseCase(KeyPairRepository keyPairRepository,
                                  ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread) {
        super(threadExecutor, postExecutionThread);
        this.keyPairRepository = keyPairRepository;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return keyPairRepository.generate();
    }
}
